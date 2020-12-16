public class PrintTest {
    public static void main(String[] args) {
        CharNumPrinter printer = new CharNumPrinter();
        new PrintCharThread("printChar", printer).start();
        new PrintNumThread("printNum", printer).start();

    }
}
