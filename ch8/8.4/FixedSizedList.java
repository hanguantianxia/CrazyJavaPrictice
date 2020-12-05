import java.lang.reflect.Array;
import java.util.List;

/**
 * FixedSizedList
 */
public class FixedSizedList {

    public static void main(String[] args) {
        List fixedLit = Array.asList("疯狂Java讲义", "轻量级Java EE");
        System.out.println(fixedLit.getClass());
        fixedLit.forEach(System.out::println);

        fixedLit.add("C");
        fixedLit.add("Ca");
    }
}