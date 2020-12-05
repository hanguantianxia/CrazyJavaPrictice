public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color ,double a, double b, double c){
        super();
        this.setColor(color);
        this.setSides(a,b,c);
    }

    public void setSides(double a, double b, double c){
        if( a >= b + c || b >= a + c || c >= a + b){
            System.out.println("The sum of two side in a triangle must larger than the third side.");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }
    // rewrite the shape perimeter
    public double callPerimeter() {
        return a + b + c;
    }

    // overwrite shape method in the shape class
    public String getType(){
        return "Triangle";
    }

}
