package para3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(30000);
        while (true){
            Socket s = ss.accept(); //
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("Hello, you received the New Year Wish from Server!");
            ps.close();
            s.close();
        }
    }
}
