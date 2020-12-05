import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendContent {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("out.txt", "rw")){
            raf.seek(raf.length());
            raf.write("Append Content!\r\n".getBytes());
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
