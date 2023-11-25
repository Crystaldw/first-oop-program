package lesson2;

public class Zoo {
    public static void main(String[] args) {

        Tiger bigTiger = new Tiger();
        bigTiger.weight = 150;
        System.out.println(bigTiger.weight);
        bigTiger.sleep();

        System.out.println(Tiger.legsCount);

        byte i =7;
        System.out.println(i);

        Tiger smallTiger = new Tiger();
        System.out.println(bigTiger.legsCount);
        smallTiger.legsCount = 5;
        System.out.println(smallTiger.legsCount);
    }
}
