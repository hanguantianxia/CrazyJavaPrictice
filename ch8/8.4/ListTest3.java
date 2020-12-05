import java.util.List;
import java.util.ArrayList;

public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("Java EE in Action"));
        books.add(new String("Crazy Java"));
        books.add(new String("Crazy Android"));
        books.add(new String("Crazy iOS"));
        books.sort((o1, o2)->{
            return ((String)o1).length() - ((String)o2).length();
        });
        System.out.println(books);

        books.replaceAll(ele->((String)ele).length());
        System.out.println(books);

    }
}
