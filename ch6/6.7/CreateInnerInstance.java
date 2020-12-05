class Out{
    class In{
        public In(String msg){
            System.out.println(msg);
        }
    }
}

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("test info");
        /*
        * equal to 3 lines of codes
        * Out.In in;
        Outout = new Out();
        in = out.new In("test info");
        */
    }
}
