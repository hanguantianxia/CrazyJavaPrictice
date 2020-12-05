class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println("My age:" + age + ", my height: " + height);
    }
}


public class ReferenceArrayTest{
    public static void main(String[] args) {
        // define a students array  referencable variable
        Person[] students;

        students = new Person[2];

        // define person zhang
        Person zhang = new Person();
        zhang.age = 15;
        zhang.height = 1.65;
        // define person lee
        Person lee = new Person();

        for(Person person : students){
            System.out.println(person); // initialize by null
        }

        lee.age = 16;
        lee.height = 1.55;

        students[0] = zhang;
        students[1] = lee;


        lee.info();
        students[1].info();

        Person a = new Person();
        testInfo(a);
        System.out.println(a);

    }

    public static void testInfo(Person a){
        System.out.println(a);
    }
}

