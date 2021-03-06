import utils.Person;
import utils.Teacher;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteTeacher {
    public static void main(String[] args) {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"))
                ){
            Person per = new Person("孙悟空", 500);
            Teacher t1 = new Teacher("唐僧", per);
            Teacher t2 = new Teacher("菩提老祖", per);
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.writeObject(per);
            oos.writeObject(t2);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
