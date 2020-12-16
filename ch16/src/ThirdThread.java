import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args) {
        ThirdThread rt = new ThirdThread();

        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
           int i = 0;
           for(; i < 100; i++){
               System.out.println(Thread.currentThread().getName() + " i: " + i);
           }
           return i;
        });

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i: " + i);
            if( i == 20){
                new Thread(task, "The return value thread: ").start();
            }
        }
        try{
            System.out.println("The sub process return value: " + task.get());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
