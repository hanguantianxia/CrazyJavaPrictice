package utils;

import java.io.IOException;
import java.util.Objects;

public class CustomPerson implements java.io.Serializable{
    private String name;
    private int age;

    public CustomPerson(String name, int age){
        System.out.println("The countructor with params");
        this.name = name;
        this.age = age;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException{
        out.writeObject(new StringBuffer(name).reverse());
        out.writeInt(age);
    }

    private void readObject(java.io.ObjectInputStream in)throws IOException, ClassNotFoundException{
        this.name = ((StringBuffer)in.readObject()).reverse().toString();
        this.age = in.readInt();
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


    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(this==null || getClass() != o.getClass()) return false;
        CustomPerson that = (CustomPerson)o;
        return age == that.age && name.equals(that.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
