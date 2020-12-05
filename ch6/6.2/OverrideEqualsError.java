class Person{
    public boolean equals(Object obj){
        return true;
    }
}
class Dog{}

public class OverrideEqualsError {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Person Object is euqal to Dog obj?" + p.equals(new Dog()));
        System.out.println("Person Obj is equal to string obj" + p.equals(new String("Hello")));
    }   
}
