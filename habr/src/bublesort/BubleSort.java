package bublesort;

public class BubleSort {
    public static void main(String[] args) {

        int[]array = new int[100];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = (int)temp;
                }
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        }
    }

