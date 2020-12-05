public class Apple {
    public String name;
    public String color;
    public double weight;
    public Apple(){}

    public Apple(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Apple(String name, String color, double weight){
        this(name, color);
        this.weight = weight;
        // this(name, color); // Error: the constructor recall another constructor must be the first line 
    }
}
