public class Printer implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "прождал 3 секю");
    }
}
