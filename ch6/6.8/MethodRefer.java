@FunctionalInterface
interface Converter{
    Integer convert(String from);
}


/**
 * MethodRefer
 */
public class MethodRefer {

    public static void main(String[] args) {
        Converter converter1 = from -> Integer.valueOf(from);
        Integer val = converter1.convert("321");
        System.out.println(val);

        Converter converter2 = Integer::valueOf;
        Integer val2 = converter2.convert("321");
        System.out.println(val2);
        
    }
}