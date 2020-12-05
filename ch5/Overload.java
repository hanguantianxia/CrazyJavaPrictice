public class Overload {
    public void test(){
        System.out.println("No parameters");
    }

    public void test(String msg){
        System.out.println("Over loaded test method: "  + msg);
    }

    public static void main(String[] args){
        Overload ol = new Overload();
        ol.test();
        ol.test("data");
    }
}
