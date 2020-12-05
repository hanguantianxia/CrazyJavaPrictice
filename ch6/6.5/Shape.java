/**
 * Shape
 */
public abstract class Shape {
    {
        System.out.println("Implement shape initalization block...");
    }
    private String color;
    
    public abstract double callPerimeter();
    public abstract String getType();

    public Shape(){}
    public Shape(String color){
        System.out.println("Implement Shape's constructor...");
        this.color = color;
    }
    // ignore the setter and getter method
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    

}