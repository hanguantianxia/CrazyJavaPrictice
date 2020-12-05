class Person{
    public int age;
    public String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "name: " + name + " age: " +  age;
    }
}

public class FinalLocalVariableTest {
    public static void  testInt(final int a){
        // a = 5; // cannot change the final variable 
    }
    public static void testObj(final Person p){
        // it can change the p's fields
        p.age = 10;
    }
    public static void main(String[] args) {
        Person p = new Person("Wang Gang", 23);
        testObj(p);
        System.out.println(p);

        int a = 10;
        testInt(a);
    }
}
