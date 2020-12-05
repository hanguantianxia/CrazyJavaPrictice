import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        try(//create file input stream
            FileReader fr = new FileReader("FileInputStreamTest.java")
        ){
            char[] cbuff = new char[32];
            int hasRead = 0;
            while ((hasRead = fr.read()) > 0){
                // get the char from the file stream
                System.out.print(new String(cbuff, 0, hasRead));
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
