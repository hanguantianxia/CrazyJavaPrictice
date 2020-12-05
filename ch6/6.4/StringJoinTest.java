public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "Crazy Java";
        String s2 = "Crazy" + " Java";
        System.out.println(s1==s2);

        String str1 = "Crazy"; // str1 in 
        String str2 = " Java";

        String s3 = str1 + str2; // the s3 in heap
        System.out.println(s1 == s3);
    }
}
