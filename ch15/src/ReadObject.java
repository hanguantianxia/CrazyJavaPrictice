
import utils.Person;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.txt"))
                ){
            Person p = (Person)ois.readObject();
            System.out.println("Name: " + p.getName() + "\n Age: " + p.getAge());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
