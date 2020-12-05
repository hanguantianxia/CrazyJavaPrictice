import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {
            "Crazy Java", "Crazy iOS", "Java EE in Action"
        };

        List bookList = new ArrayList();

        for(int i=0;i<books.length;i++){
            bookList.add(books[i]);
        }
        ListIterator lit = bookList.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
            lit.add("-----------split line------------");
        }
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
        
    }    
}
