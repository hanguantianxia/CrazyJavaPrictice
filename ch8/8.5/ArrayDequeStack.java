import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeStack{
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        LinkedList ll = new LinkedList();
        stack.push("Crazy Java");
        stack.push("Java EE in Action");
        stack.push("Crazy Android");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        ll.push("Crazy Java");
        ll.push("Jave EE in Action");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        
    }
}