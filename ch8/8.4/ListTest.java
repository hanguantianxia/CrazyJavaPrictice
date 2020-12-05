import java.util.List;
import java.util.ArrayList;
public class ListTest{
    public static void main(String[] args) {
        List books = new ArrayList();
        
        books.add(new String("Java EE in Action"));
        books.add(new String("Crazy Java"));
        books.add(new String("Crazy Android"));
        System.out.println(books);

        books.add(1, new String("Crazy Ajax"));

        for(int i=0; i < books.size(); i++){
            System.out.println(books.get(i));
        }

        books.remove(2);
        System.out.println(books);

        System.out.println(books.indexOf(new String("Crazy Java")));
        books.set(1, new String("java"));

        System.out.println(books);

        System.out.println(books.subList(1, 2));
    }
}