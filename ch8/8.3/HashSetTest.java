import java.util.HashSet;

class A{
    public boolean equals(Object obj){
        return true;
    }
}

class B{
    @Override
    public int hashCode() {
        return 1;
    }
}


class C{
    public int hashCode(){
        return 2;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

/**
 * HashSetTest
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}