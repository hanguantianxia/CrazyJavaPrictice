import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) throws Exception{
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Callable<Integer> target = () ->{
            for(int i = 0; i < 100; i++){
                System.out.println(Thread.currentThread().getName() + " value: " + i);
            }
            return 0;
        };

        pool.submit(target);
        pool.submit(target);
        pool.shutdown();
    }
}
