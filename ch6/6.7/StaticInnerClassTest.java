public class StaticInnerClassTest {
    private int prop1 = 5;
    private static int prop2 = 8;
    static class StaticInnerClass{
        private static int age;
        public void accessOuterProp(){
            // following code raise Error
            // static inner class cannot access any outer class instances fields
            // System.out.println(prop1);

            System.out.println(prop2);
        }
    }

    
}
