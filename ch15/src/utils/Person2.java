package utils;

public class Person2 implements java.io.Serializable{
    private String name;
    private transient int age;

    public Person2(String name, int age){
        System.out.println("The constructor with parameter");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
