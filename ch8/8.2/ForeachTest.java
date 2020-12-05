import java.util.*;

public class ForeachTest {
    public static void main(String[] args) {
        Collection books = new ArrayList();

        books.add("Java EE in Action");
        books.add("Crazy Java");
        books.add("Crazy Android");

        for(Object obj : books){
            String book = (String)obj;
            System.out.println(book);
            if(book.equals("Crazy Java")){
                books.remove(book); //并没有报错
            }
        }
        System.out.println(books);
    }
}
