import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPool {
    public static void main(String[] args) {
        ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();
        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(1);
        ExecutorService cashedExecutorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
//            fixedExecutorService.execute(new Printer());
//            singleExecutorService.execute(new Printer());
            cashedExecutorService.execute(new Printer());
        }
    }
}
