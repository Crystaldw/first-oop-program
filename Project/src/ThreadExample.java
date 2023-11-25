public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() ->{
            while (!Thread.currentThread().isInterrupted()){

                System.out.println(1233);
            }
        });

        Thread thread1 = new Thread(() ->{
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        });
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
