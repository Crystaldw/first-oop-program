import java.util.ArrayList;
import java.util.Random;

public class MainMinPositive {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(-1000, 1000));
        }
        System.out.println(list);


        for (int i = 1; i >= list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                System.out.println(list.get(i) + " ");
            }
        }
        System.out.println();
        int minPositive = Integer.MAX_VALUE;
        for (int value : list) {
            if (value > 0 && value < minPositive) {
                minPositive = value;
            }
            if (minPositive == Integer.MAX_VALUE) {
                System.out.println("В списке нет положительных элементов. ");
            } else {
                System.out.println("Наименьший положительный элемент " + minPositive);
            }
        }
    }
}


