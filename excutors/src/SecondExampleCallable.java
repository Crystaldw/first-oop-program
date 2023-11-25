import java.util.Random;
import java.util.concurrent.*;

public class SecondExampleCallable {
    public static void main(String[] args) {
        Callable<Boolean> callable = ()->{
            Random random = new Random();
            int number = random.nextInt(0,1000);

            if (number != 0){
                System.out.println("все очень плохо");
                return  false;
            }else {
                System.out.println("Все хорошо");
                return true;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean>future = executorService.submit(callable);

        try {
//            Boolean result = future.get();
//            if (result){
//                System.out.println("Super");
//            }
//            else {
//                future = executorService.submit(callable);
//                System.out.println(future.get());
//            }
            do {
                future = executorService.submit(callable);
            }while (!future.get());

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
