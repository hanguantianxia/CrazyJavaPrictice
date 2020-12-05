import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorEach {
    public static void main(String[] args) {
        Collection books = new HashSet();

        books.add("Java EE in Action");
        books.add("Crazy Java");
        books.add("Crazy Android");

        Iterator it = books.iterator();
        it.forEachRemaining(obj->System.out.println("The iterate element is: "+ obj));
    }
}
