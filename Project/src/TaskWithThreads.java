public class TaskWithThreads {

    Thread threadFirst = new Thread(()-> {
        Long start = System.currentTimeMillis();
        for (int i = 0; i <50000000 ; i++) {
            if(i%17 ==0){
                System.out.println(i);
            }
        }
        long finish = System.currentTimeMillis();

        System.out.println(finish - start + " ms.");
    });
}
