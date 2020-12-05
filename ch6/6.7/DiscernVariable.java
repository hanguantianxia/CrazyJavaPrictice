public class DiscernVariable {
    private String prop = "the instance of Outer Class";
    private class InClass{
        private String prop = "the instance of Inner Class";
        public void info(){
            String prop = "Local Variable";
            // using outer_class_name.this.varName to access outer class instance variable
            System.out.println("Extern class instance variable: " + DiscernVariable.this.prop);
            System.out.println("Inner Instance varivble: " + this.prop);
            System.out.println("Local variable value: " + prop);
        }
    }

    public void test(){
        InClass in = new InClass();
        in.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}
