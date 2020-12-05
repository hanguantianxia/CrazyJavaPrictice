import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cmp implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class SortTest{
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-3);
        nums.add(4);
        nums.add(5);
        nums.add(2);
        
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);
        Collections.sort(nums, new Cmp());
        System.out.println(nums);
        Collections.shuffle(nums);
        System.out.println(nums);
    }
}