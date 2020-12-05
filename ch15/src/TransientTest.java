import utils.Person2;

import java.io.*;

public class TransientTest {
    public static void main(String[] args) {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"))
                ){
            Person2 per = new Person2("孙悟空",500);
            oos.writeObject(per);
            Person2 p = (Person2)ois.readObject();
            System.out.println(p.getAge());
        }
        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
