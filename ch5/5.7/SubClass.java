class BaseClass{
    public int book = 5;
    public void base(){
        System.out.println("Super class's normal method!");
    }

    public void test(){
        System.out.println("Super class overwrite method!");
    }

}

public class SubClass extends BaseClass{
    public String book = "Java EE textbook";
    public void test(){
        System.out.println("Sub class overwrite the super class method!");
    }

    public void sub(){
        System.out.println("Sub class normal method!");
    }
    
    public static void main(String[] args) {
        BaseClass bc = new BaseClass();

        bc.base();
        bc.test();

        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.sub();
        sc.test();

        BaseClass ploymophicBc = new SubClass();

        System.out.println(ploymophicBc.book); // use the var of base class not sub class

        ploymophicBc.base();
        ploymophicBc.test();
        // ploymophicBc.sub() // error! no such method in Baseclass s
    }
}