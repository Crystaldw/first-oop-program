public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(123);
    }

    public static void hello(){
        synchronized (MyThread.class){

        }
    }

}
