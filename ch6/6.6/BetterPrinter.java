import lee.Output;

public class BetterPrinter implements Output {
    private String[] printData = new String[MAX_CACHE_LINE*2];
    private int dataNum = 0;
    @Override
    public void out() {
        // print until the tasks finished
        while (dataNum>0) {
            // TODO Auto-generated method stub
            System.out.println("Printer is printing the data: " + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }
    @Override
    public void getData(String msg) {
        if(dataNum>=MAX_CACHE_LINE*2){
            System.out.println("The output task queue is full, add failed");
        }
        else{
            printData[dataNum++] = msg;
        }
    }
}
