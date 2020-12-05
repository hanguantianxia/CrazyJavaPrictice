import java.util.List;
import java.util.ArrayList;

class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListTest2 {
    public static void main(String[] args) {
        List books = new ArrayList();

        books.add(new String("Java EE in Action"));
        books.add(new String("Crazy Java"));
        books.add(new String("Crazy Android"));

        System.out.println(books);
        books.remove(new A());
        System.out.println(books);

        books.remove(new A());
        System.out.println(books);

    }
}
