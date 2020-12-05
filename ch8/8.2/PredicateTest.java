import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java EE in Action");
        books.add("Crazy Java");
        books.add("Crazy Android");
        books.add("Crazy iOS");
        books.add("Crazy Ajax");

        System.out.println(books);
        books.removeIf(ele->((String)ele).length()<10);
        System.out.println(books);
    }
}
