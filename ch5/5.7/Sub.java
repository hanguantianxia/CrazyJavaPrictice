class Base{
    public Base(){
        test();
    }

    public void test(){
        System.out.println("This method will be overwrited by sub class!");
    }
}
public class Sub extends Base {
    private String name;
    public void test(){
        System.out.println("Sub class overwrite super class method, " +
        "its name String length is " + name.length());
    }

    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
