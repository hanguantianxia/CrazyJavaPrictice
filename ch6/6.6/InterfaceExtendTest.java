interface interfaceA{
    int PROP_A = 5;
    void testA();
}
interface interfaceB{
    int PROP_B = 7;
    void testB();
}
interface interfaceC{
    int PROP_C = 9;
    void testC();
}
interface interfaceD extends interfaceA, interfaceB, interfaceC{
    int PROP_D = 11;
    void testD();
}

/**
 * InterfaceExtendTest
 */
public class InterfaceExtendTest {

    public static void main(String[] args) {
        System.out.println(interfaceD.PROP_A);
        System.out.println(interfaceD.PROP_B);
        System.out.println(interfaceD.PROP_C);
        System.out.println(interfaceD.PROP_D);
    
    }
}