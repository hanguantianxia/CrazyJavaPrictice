class Parent{
    public String tag = "Crazy Java Textbook";
}
class Derived extends Parent{
    private String tag = "Java EE in Action";
}

public class HidTest {
    public static void main(String[] args) {
        Derived d = new Derived();
        // the program cannot access the private variable tag
        // System.out.println(d.tag); // Error
        // d variable explicitly convert to Parent
        System.out.println(((Parent)d).tag);
    }
}
