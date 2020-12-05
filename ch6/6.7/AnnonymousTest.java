interface Product{
    public double getPrice();
    public String getName();
}

public class AnnonymousTest {
    public void test(Product p) {
        System.out.println("Buy a "+ p.getName() + " , spend " + p.getPrice());
    }

    public static void main(String[] args) {
        AnnonymousTest ta = new AnnonymousTest();
        ta.test(new Product(){
            
            public String getName(){
                return "Nvidia";
            }
            
            public double getPrice(){
                return 536.3;
            }
            
        });


        class AnnonymousProduct implements Product{
            @Override
            public String getName() {
                return "AMD";
            }
            @Override
            public double getPrice() {
                return 4.3;
            }
        }
        ta.test(new AnnonymousProduct());
    }
}
