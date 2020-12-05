import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest{
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        c.remove(6);
        System.out.println("c collection element size: " + c.size()); // output 2
        System.out.println("is collection c contain \"孙悟空\" string" + c.contains("孙悟空"));
        c.add("Java EE in action");
        System.out.println("collection c elements: " + c);

        Collection books = new HashSet();
        books.add("Java EE in action");
        books.add("Crazy Java");
        System.out.println("Collection C is containing books?" + c.containsAll(books));
        c.removeAll(books);

        System.out.println(c);

        //delete all in c
        c.clear();

        System.out.println("The element in C collection:" + c);
        books.retainAll(c);

        System.out.println("the set books elements: " + books);
    }
}