import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
                java.io.FileOutputStream fos = new java.io.FileOutputStream("newFile.txt")
                ){
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while (( hasRead = fis.read(bbuf)) > 0){
                fos.write(bbuf,0,hasRead);
            }
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
