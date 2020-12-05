public class Varargs {
    // define the undefined variables
    public static void test(int a, String... books){
        // books is an array object
        for(String book : books){
            System.out.println(book);
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        // recall test method
        test(5, "Crazy java textbook", "Jave EE in Action");
    }
}
