public class Outer {
    private int outProp = 9;
    class Inner{
        private int inProp = 5;
        public void accessOuterProp(){
            System.out.println("the outProp value in Outer Class: " + outProp);
        }
    }

    public void accessInnerProp(){
        // outper class cannot directly access the field in the instance of inner class
        // System.out.println("Inner Class's inProp:" + inProp); // Error
        // because at this time we HAVE NOT create a instance of inner class, so we cannot access the fields of inner instances
        System.out.println("inner class inprop" + new Inner().inProp);
    }

    public static void main(String[] args) {
        // implement following codes, create a outer class, and have not create inner instances
        Outer out = new Outer();
        out.accessInnerProp();
    }

}
