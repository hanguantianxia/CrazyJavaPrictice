public class Dog {
    public void jump(){
        System.out.println("jumping......");
    }
    public void run(){
        // d.jump();
        jump();
        System.out.println("running......");
    }
}
