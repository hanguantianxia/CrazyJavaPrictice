package para3.Senior.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{
    private Socket socket;
    BufferedReader br = null;
    PrintStream ps = null;

    public ServerThread(Socket socket) throws IOException {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ps = new PrintStream(socket.getOutputStream());
            String line = null;

            while ((line = br.readLine()) != null){
                if(line.startsWith(CrazyitProtocol.USER_ROUND)
                        && line.endsWith(CrazyitProtocol.USER_ROUND)){
                    String userName = getRealMsg(line);
                    if (Server.clents.map.containsKey(userName)){
                        System.out.println("Repeat");
                        ps.println(CrazyitProtocol.NAME_REP);
                    }
                    else{
                        System.out.println("Success!");
                        ps.println(CrazyitProtocol.LOGIN_SUCCESS);
                        Server.clents.put(userName, ps);
                    }
                }
                else if(line.startsWith(CrazyitProtocol.PRIVATE_ROUND) && line.endsWith(CrazyitProtocol.PRIVATE_ROUND)){
                    String userAndMsg = getRealMsg(line);
                    String[] res = userAndMsg.split(CrazyitProtocol.SPLIT_SIGN);
                    String user = res[0];
                    String msg = res[1];
                    Server.clents.map.get(user).println(Server.clents.getKeyByValue(ps) + " Whisper to you: " + msg);//to the target user
                }
                else{
                    String msg = getRealMsg(line);
                    for (PrintStream clentPs : Server.clents.valueSet()){
                        clentPs.println(Server.clents.getKeyByValue(ps) + " say: " + msg);
                    }
                }
            }

        }
        catch (IOException ex){
            Server.clents.removeByValue(ps);
            System.out.println(Server.clents.map.size());

            try {
                if (br != null){
                    br.close();
                }
                if (ps!=null){
                    ps.close();
                }
                if (socket!=null){
                    socket.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    private String getRealMsg(String line){
        return line.substring(CrazyitProtocol.PROTOCOL_LEN, line.length() - CrazyitProtocol.PROTOCOL_LEN);
    }
}
