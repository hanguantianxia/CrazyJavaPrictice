import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();

        books.add("Java EE in Action");
        books.add("Crazy Java");
        books.add("Crazy Android");
        
        books.forEach(obj->System.out.println("the iterator element" + obj));
    }
}
