import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorTest {
    public static void main(String[] args) {
        // add 
        Collection books = new HashSet();

        books.add("Java EE in Action");
        books.add("Crazy Java");
        books.add("Crazy Android");
        System.out.println(books);
        Iterator it = books.iterator();
        while (it.hasNext()) {
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("Crazy Java")) {
                System.out.println(book);
                it.remove();
            }
        }
        System.out.println(books);
    }
}
