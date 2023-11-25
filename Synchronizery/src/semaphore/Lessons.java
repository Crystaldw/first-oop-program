package semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class Lessons {
    public static void main(String[] args) throws InterruptedException {

        List<Integer>list = new CopyOnWriteArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread thread = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                list.add(i);
            }
            countDownLatch.countDown();
        });

        Thread secondThread = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                list.add(i);
            }
            countDownLatch.countDown();
        });

        thread.start();
        secondThread.start();

        thread.join();
        secondThread.join();

        countDownLatch.await();

        System.out.println(list);
    }
}
