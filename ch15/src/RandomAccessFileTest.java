import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try(
                RandomAccessFile raf = new RandomAccessFile("RandomAccessFileTest.java", "r")
                ){
            // get the RandomAccessFile Object file point pos, init pos equals to 0
            System.out.println("RandomAccessFile the init pos" +raf.getFilePointer());
            raf.seek(18);
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while ((hasRead = raf.read(bbuf)) > 0){
                System.out.print(new String(bbuf, 0, hasRead));
            }

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
