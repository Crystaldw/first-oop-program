package semaphore;

import java.util.concurrent.Semaphore;

public class Example1 {

    public static void main(String[] args) throws Exception {

        Semaphore semaphore = new Semaphore(5,true);
        boolean[] freeTables = new boolean[5];
        String[]personNames = new String[]{"Kira", "Leo", "Vladislav", "Inna", "Roma", "Andreu", "Alex", "Ola"};

        for (int i = 0; i < personNames.length ; i++) {
//            Thread thread = new Thread(new Person(personNames[i], semaphore, freeTables));
//            thread.start();
            Thread.sleep(1000);
        }
    }
}
