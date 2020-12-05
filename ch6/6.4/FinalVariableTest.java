/**
 * FinalVariableTest
 */
public class FinalVariableTest {

    // assign the intial value when define it
    final int a = 6;

    // following variables will inital in constructor or initalization block
    final  String str;
    final int c;
    final static double d;

    // initializa block
    {
        str = "Hello";
        // a= 9; // cannot reassign the a another value because a has been assgined in define process
    }

    static
    {
        d = 5.6;
    }

    // constructor
    public FinalVariableTest(){
        c = 5;
    }

    public void  changeFinal(){
        // ordinary method cannot assinal final variable another value
        // d = 1.2;
        // ch = 'a';
    }

    public static void main(String[] args) {
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.d);
        System.out.println(ft.c);
    }

}