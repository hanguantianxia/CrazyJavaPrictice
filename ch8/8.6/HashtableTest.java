import java.util.Hashtable;

class A{
    int count;
    public A(int count){
        this.count = count;
    }

    public boolean equals(Object obj){
        if( obj == this){
            return true;
        }
        if(obj !=null && obj.getClass() == A.class){
            A a = (A)obj;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}

class B{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(5099), "Crazy Java");
        ht.put(new A(4342), "Crazy C++");
        ht.put(new A(423423), new B());
        System.out.println(ht);

        System.out.println(ht.containsKey("test stirng"));
        System.out.println(ht.containsKey(new A(312312)));
        ht.remove(new A(5099));
        System.out.println(ht);
    }
}
