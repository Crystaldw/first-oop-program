package homework;

import java.util.ArrayList;
import java.util.Random;

public class TestArrayList {

    public static void main(String[] args) {

        int size = 100;
        int maxValue = 1000;
        int minValue = -1000;
        ArrayList<Integer> arrayList = createArrayList(size, minValue, maxValue);
        System.out.println(arrayList);
        printMore(arrayList);
        System.out.println(getMinPositiveValue(arrayList));

    }

    public static ArrayList<Integer> createArrayList(int size, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(min, max));
        }
        return arrayList;
    }

    public static void printMore(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1) < arrayList.get(i)) {
                System.out.print(arrayList.get(i) + ", ");
            }
        }
        System.out.println();
    }

    public static int getMinPositiveValue(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }
}
