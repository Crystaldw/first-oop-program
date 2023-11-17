package maxminnumber;

/*
Задача:
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает
значение в промежутке [0, 1].
 */
public class MaxMinNumber {

    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if(min>array[i])
                min=array[i];
            avg +=array[i]/array.length;
        }
        System.out.println("Max: " + max);

        System.out.println("Min: "+ min);
        System.out.println("Avg: " + avg);

    }
}
