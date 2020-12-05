import java.util.Deque;
import java.util.LinkedList;

class MyClass<E>{
    public <T> MyClass(T t){
        System.out.println("t param is:" + t);
    }
}

public class GenericDiamondTest {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<>(5);
        MyClass<String> mc2 = new <Integer>MyClass<String>(5);
        // MyClass<String> mc3 = new <Integer>MyClass<>(5); // Erro cannot use diamond grammerll

        Deque<Integer> q = new LinkedList<>();
        Integer a = Integer(5);
        System.out.println(a);
    }

}
