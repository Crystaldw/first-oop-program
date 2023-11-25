public class Main {
    public static void main(String[] args) {

        int count = 0;
        Long start = System.currentTimeMillis();
        for (int i = 0; i <2000000000 ; i++) {
            if(i%17 ==0){
            count++;
            }
        }
        long finish = System.currentTimeMillis();

        System.out.println(finish - start + " ms.");
        System.out.println(count);
    }
}