/**
 * Cow
 */
public class Cow {

    private double weight;
    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }

    //define an non-static inner class
    private class CowLeg{
        private double length;
        private String color;

        // no static inner class
        public CowLeg(){}
        public CowLeg(double length, String color){
            this.length = length;
            this.color = color;
        }


        public String getColor() {
            return color;
        }
        public double getLength() {
            return length;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public void info(){
            System.out.println("Current CowLeg's color is:" + color + ", Height: " + length);
            // directly access extern class's private fields
            System.out.println("The weight of the Cow this leg belong is:" + weight);
        }
    }

    public void test(){
        CowLeg cl = new CowLeg(1.12, "Black and White!");
        cl.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(377.9);
        cow.test();
    }
}