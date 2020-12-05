public class AddCommand implements Command {
    @Override
    public void process(int[] target) {
        int sum = 0;
        for(int tmp:target){
            sum += tmp;
        }
        System.out.println("The sum of elements of array is: " + sum);
    }
}
