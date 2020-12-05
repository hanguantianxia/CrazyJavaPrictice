class Apple{
    private String color;
    private double weight;

    public Apple(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public String toString(){
        return "An Apple, the color is :" + color + ".Weight is " + weight;
    }
}


public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("Red", 5.38);
        System.out.println(a);
    }    
}
