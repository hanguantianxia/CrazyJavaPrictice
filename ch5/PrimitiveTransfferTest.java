public class PrimitiveTransfferTest {
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("int swap method, a is "+ a + " b is " + b);
    }
    public static void main(String[] args){
        int a = 6;
        int b = 9;
        swap(a,b);
        System.out.println("After swapping, a is "+a+" b is "+b);
    }
}
