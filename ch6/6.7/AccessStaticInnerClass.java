public class AccessStaticInnerClass {
    static class StaticInnerClass{
        private static int propl = 5;
        private int prop2 = 9;
    }
    public void AccessStaticInnerProp(){
        // System.out.println(prop1);tt
        // upper code is error, should change to following form
        System.out.println(StaticInnerClass.propl);

        System.out.println(new StaticInnerClass().prop2);
    }
}
