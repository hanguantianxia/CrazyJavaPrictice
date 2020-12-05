public class PrintCommand implements Command{
    @Override
    public void process(int[] target) {
        for(int item:target){
            System.out.println(item);
        }
    }
}
