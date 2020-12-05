import utils.Teacher;
import utils.Person;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTeacher {
    public static void main(String[] args) {
        try(
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("teacher.txt")
                )
                ){
            Teacher t1 = (Teacher)ois.readObject();
            Teacher t2 = (Teacher)ois.readObject();
            Person per = (Person)ois.readObject();
            Teacher t4 = (Teacher)ois.readObject();

            System.out.println("the student of t1 is the person? " + (t1.getStudent() == per));
            System.out.println("the student of t2 is the person? " + (t2.getStudent() == per));
            System.out.println("the  t4 is t2? l" + (t2 == t4));



        }
        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
