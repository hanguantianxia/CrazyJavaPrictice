import java.util.Scanner;

/**
 * ScannerKeyBoardTest
 */
public class ScannerKeyBoardTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // output 
            System.out.println("The input from keyboard is :" + sc.next());
        }
    }
}