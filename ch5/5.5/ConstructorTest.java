public class ConstructorTest{
    public String name;
    public int count;

    public ConstructorTest(String name, int count){
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        // define my constructor
        ConstructorTest tc = new ConstructorTest("Java Crazy Textbook", 9999);

        System.out.println(tc.name);
        System.out.println(tc.name);
    }
    
}