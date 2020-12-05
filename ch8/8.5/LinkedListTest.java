import java.util.LinkedList;


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();

        books.offer("Crazy Java");
        books.push("Java EE in Action");
        books.offerFirst("Crazy Android");

        for (int i = 0; i < books.size(); i++) {
            System.out.println("for: " + books.get(i));
        }

        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
