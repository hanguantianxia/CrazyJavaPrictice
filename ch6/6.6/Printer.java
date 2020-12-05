import lee.Output;

interface Product{
    int getProductTime();

}



public class Printer implements Output, Product{
    private String[] printData = new String[MAX_CACHE_LINE];
    // recoder the number of print task 
    private int dataNum = 0;
    public void out(){
        while (dataNum > 0) {
            System.out.println("Printer print: " + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }

    }
    public void getData(String msg) {
        if(dataNum >= MAX_CACHE_LINE){
            System.out.println("The queue of tasks is full, add failed");
        }
        else{
            printData[dataNum++] = msg;
        }
    }

    public int getProductTime() {
        return 46;
    }
    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("Crazy Java EE in action");
        o.getData("Crazy Jave");
        o.out();
        o.getData("Crazy Andriod");
        o.getData("Crazy Ajax");
        o.out();
        o.print("Sun Wukong", "Zhu Bajie", "Baid Gujie");
        o.test();
        Product p = new Printer();
        System.out.println(p.getProductTime());
        Object obj = p;
    }
}
