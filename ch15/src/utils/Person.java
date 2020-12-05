package utils;

public class Person implements java.io.Serializable{
    private String name;
    private int age;
    public Person(String name, int age){
        System.out.println("The Constructor with Params");
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
