public class MagicMain {

    public static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                increase();
            }
        });
        Thread thread1 = new Thread(()->{
            for (int i = 0; i <100000 ; i++) {
                increase();
            }
        });

        thread.start();
        thread1.start();

        Thread.sleep(100);

        System.out.println(value);

    }
    private synchronized static void increase(){
        value++;
    }
}
