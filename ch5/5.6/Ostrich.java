public class Ostrich extends Bird {
    public void fly(){
        System.out.println("I am running and flying ....");
    }

    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.fly();
    }
}
