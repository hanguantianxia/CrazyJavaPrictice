
public class PrintNumThread extends Thread{
    private CharNumPrinter  printer;
    public PrintNumThread(String name, CharNumPrinter printer){
        super(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        try{
            printer.printNum();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
}
