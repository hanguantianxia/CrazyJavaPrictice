import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("Crazy Java");
        books.add("Java EE in Action");
        System.out.println(books);
        // delete Crazy Java Textbook
        books.remove("Crazy Java");
        books.add("Crazy Java");
        System.out.println(books);

    }
}
