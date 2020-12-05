class Foo{
    public <T> Foo(T t){
        System.out.println(t);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        new Foo("Crazy Java");
        new Foo(200);
        new <String> Foo("Crzy Android");
        // new <String> Foo(12.3); // Error Double class is not the sub class of String

    }
}
