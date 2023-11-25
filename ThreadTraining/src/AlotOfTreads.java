public class AlotOfTreads {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() ->{
                try{
                    Thread.sleep(5000);

                }catch (InterruptedException e){
                    throw  new RuntimeException(e);
                }
            });
            System.out.println(Thread.currentThread());
            thread.start();
        }
    }
}
