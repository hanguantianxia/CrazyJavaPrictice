import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("javac");
        try (
                BufferedReader brError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                BufferedReader brRight = new BufferedReader(new InputStreamReader(p.getInputStream()))
                ){
            String buff = null;
            while ( (buff = brRight.readLine()) != null){
                System.out.println(buff);
            }

            while ( (buff = brError.readLine()) != null){
                System.out.println(buff);
            }


        }
    }
}
