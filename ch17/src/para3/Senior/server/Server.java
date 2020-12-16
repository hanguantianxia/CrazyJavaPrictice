package para3.Senior.server;

import para3.multithread.server.ServerThread;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int SERVER_PORT = 30000;
    public static CrazyitMap<String, PrintStream> clents = new CrazyitMap<>();

    public void init(){
        try(
                ServerSocket ss = new ServerSocket(SERVER_PORT);
                ){
            while (true){
                Socket socket = ss.accept();
                new Thread( new ServerThread(socket)).start();
            }
        }
        catch (IOException ex){
            System.out.println("Server Init Failed! Is " + SERVER_PORT + " port has been occupied?");
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.init();
    }
}
