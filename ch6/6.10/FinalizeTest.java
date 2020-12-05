public class FinalizeTest {
    private static FinalizeTest ft = null;
    public void info() {
        System.out.println("Testing gabbage collection finalize method!");
    }

    public static void main(String[] args) {
        new FinalizeTest();
        System.gc();

        System.runFinalization();
        ft.info();
    }

    @Override
    protected void finalize() throws Throwable {
        ft = this;
    }
}
