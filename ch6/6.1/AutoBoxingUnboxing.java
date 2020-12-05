public class AutoBoxingUnboxing{
    public static void main(String[] args) {
        Integer inObj =5;
        Object boolObj = true;
        int it = inObj;
        if(boolObj instanceof Boolean){
            // force transfer type into Boolean, and assign the value
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }
    }
}