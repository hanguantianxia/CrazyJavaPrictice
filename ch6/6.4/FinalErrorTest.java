public class FinalErrorTest {
    final int age;
    {
        // System.out.println(age); // cannot access the final variable before initalization
        age = 6;
        System.out.println(age);
    }

    public static void main(String[] args) {
        new FinalErrorTest();
    }
}
