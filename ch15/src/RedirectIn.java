import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RedirectIn {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("FileInputStreamTest.java")
                ){
            System.setIn(fis);
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            while (sc.hasNext()){
                System.out.println("The keyboard input is:" + sc.next());

            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
