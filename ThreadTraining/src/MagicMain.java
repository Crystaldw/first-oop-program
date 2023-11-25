import java.util.concurrent.atomic.AtomicInteger;

public class MagicMain {

    public static int value = 0;
    public static int secondValue = 0;

    public static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        Object lock2 = new Object();
        Object lock1 = new Object();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock1) {
                    value++;


//                System.out.println("Какоето сообщение");
//                System.out.println("Какоето сообщение");

                synchronized (lock2) {
                    secondValue--;
                }
            }}
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock2) {
                    secondValue--;

                synchronized (lock1) {
                    value++;
                }
            }}
        });

        thread.start();
        thread1.start();

        Thread.sleep(1000);

        System.out.println(value); //20_000
        System.out.println(secondValue);

        //race condition - лечится синхронизацией
        //НО излишняя синхронизация (или неправильная синхронизация) приводит к deadLock, lifelock

        //mutex - монитор
    }

    private synchronized static void increase() {
        value++;
    }
}