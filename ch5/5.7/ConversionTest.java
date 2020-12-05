public class ConversionTest {
    public static void main(String[] args) {
        double d = 13.14;
        long l = (long)d;
        System.out.println(l);

        int in = 5;
        // boolean b= (boolean)in; // Error!
        Object obj = "Hello";
        // the type of obj is Object, because String extends Object, so we can convert forcely
        String objstr = (String)obj;
        System.out.println(objstr);
    
        // Object objPri = new Integer(5);
        // String str = (String)objPri;
    }
}
