public class GCTest{
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            new GCTest();
            Runtime.getRuntime().gc();
        }
    }

    public void finalize(){
        System.out.println("System is collecting GcTest object");
    }
}