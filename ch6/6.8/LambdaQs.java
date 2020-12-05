interface Eatable{
    void taste();
}

interface Flyable{
    void fly(String weather);
}

interface Addable{
    int add(int a, int b);
}

public class LambdaQs{
    // recall this method need Eatable object
    public void eat(Eatable e){
        System.out.println(e);
        e.taste();
    } 

    public void drive(Flyable f){
        System.out.println("I am driving: " + f);
        f.fly("It's a sunny day");
    }
    public void test(Addable add){
        System.out.println("5 plus 3 equals to "  + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();

        lq.eat(()->System.out.println("I am eating"));
        lq.drive(weather->{
            System.out.println("Today is "+ weather);
            System.out.println("Helecopter is flying stably!");
        });
        lq.test((a,b)->a+b);
        
        Runnable r = ()->{
            for(int i=0;i<100;i++){
                System.out.println();
            }
        };
        r.run();
    }
}