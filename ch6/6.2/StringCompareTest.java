public class StringCompareTest {
    public static void main(String[] args) {
        String s1 = "Crazy Java";
        String s2 = "Crazy";
        String s3 = "Java";

        String s4 = "Crazy " + "Java";

        String s5 = "Cra" + "zy" + "Java";

        String s6 = s2 + s3;

        String s7 = new String("Crazy Java");

        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s7);
        
        
    }
}
