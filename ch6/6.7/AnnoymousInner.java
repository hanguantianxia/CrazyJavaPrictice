abstract class Device{
    private String name;
    public abstract double getPrice();
    public Device(String name) {
        this.name = name;
    }
    public Device(){};
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class AnnoymousInner {
    public void test(Device d){
        System.out.println("Buy a " + d.getName() + ", spend " + d.getPrice());
    }

    public static void main(String[] args) {
        
        AnnoymousInner ai = new AnnoymousInner();
        ai.test(new Device("Filter"){
            @Override
            public double getPrice() {
                return 432.3;
            }
        });

        Device d = new Device()
        {
            //initalization block
            {
                System.out.println("Annoymous inner class intialization block...");
            }
            @Override
            public double getPrice() {
                return 53.3;
            }
            @Override
            public String getName() {
                return "KeyBoard!";
            }
        };
        ai.test(d);
    }
}
