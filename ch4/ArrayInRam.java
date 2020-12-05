public class ArrayInRam{
    public static void main(String[] args) {
        // define and initialize the array
        int[] a = {5, 7, 20};

        int[] b = new int[4];
        // output b array
        System.out.println("the length of b array:" + b.length);
        // recurrently output the elements of array a
        for(int i=0; i < a.length; i++){
            System.out.println(a[i]);
        } 
        for(int i=0, len = b.length; i < len; i++){
            System.out.println(b[i]);
        }
        b = a; // shallow copy 
        System.out.println("the length of b array:" + b.length);
    }
}