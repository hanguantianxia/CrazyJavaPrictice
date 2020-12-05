public class ArrayTest{
    public static void main(String[] args){
        int[] intArr;
        intArr = new int[]{5, 6, 8, 20};
        
        // define an Object array named
        Object[] objArr;
        objArr = new String[]{"Java", "Lee Gang"};
        Object[] objArr2;
        objArr2 = new Object[]{"Java", "Lee Gang"};

        // simplified initialization
        int[] a = {5, 6, 7, 8};

        // dynamic initialization
        int[] prices = new int[5];

        System.out.println(objArr[0]);
        objArr2[0] = "Spring";
        

        // for-each to traverse
        for(int i=0; i < prices.length; i++){
            System.out.println(prices[i]);
        }
        // we can see all data is 0, meaning JVM will initalize the int type to zero
    }
}