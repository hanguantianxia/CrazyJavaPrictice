import lee.Output;

public class OutputFactory {
    public Output getOutput(){
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("data");
        c.keyIn("Java EE");
        c.print();
    }
}
