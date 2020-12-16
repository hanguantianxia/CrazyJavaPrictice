public class PrintCharThread extends Thread{
    private CharNumPrinter printer;

    public PrintCharThread(String name, CharNumPrinter printer){
        super(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        try{
            printer.printChar();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
