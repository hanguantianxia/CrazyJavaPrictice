public class StaticAcessNonStatic {
    public void info(){
        System.out.println("Simple info method!");
    }

    public static void main(String[] args){
        // main() is static method, but info() is the non-static method
        // the class recall the main() method not instance of that class
        // therefore this cannot find the effecient object
        new StaticAcessNonStatic().info(); // error 
    }
}
