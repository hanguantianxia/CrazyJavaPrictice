import utils.CustomPerson;

import java.io.*;

public class CustomPersonTest {
    public static void main(String[] args) {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CustomPerson.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CustomPerson.txt"))
                ){
            CustomPerson per = new CustomPerson("孙悟空", 5499);
            oos.writeObject(per);

            CustomPerson p = (CustomPerson)ois.readObject();


        }
        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
