package hwAlgorithms;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }

        array[right] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 3};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


/*
Объяснение:
quickSort Функция:
Java: Основная функция, инициирующая процесс сортировки QuickSort. Проверяет, если индекс left меньше индекса right, чтобы определить, есть ли более одного элемента в разделе.
JavaScript: Та же логика, что и в Java. Если есть более одного элемента, вызывается функция partition и рекурсивно применяется QuickSort к левой и правой частям.
partition Функция:

Java: Выбирает правый элемент (pivot) в качестве опорного. Проходит по массиву, помещая элементы, меньшие опорного, слева, а большие - справа. Наконец, помещает опорный элемент в правильную позицию и возвращает индекс опорного элемента.
JavaScript: Аналогично Java, но использует деструктуризацию массива для обмена элементами. Возвращает индекс опорного элемента.
main Функция (Java):

Инициализирует массив, вызывает quickSort и выводит отсортированный массив.
Обмен элементами в массиве:

Java: Использует временную переменную для обмена элементами массива в процессе разделения.
JavaScript: Использует деструктуризацию массива для обмена элементами.
Выполнение:

Java: Основной метод инициализирует массив, вызывает quickSort и выводит отсортированный результат.
JavaScript: Сценарий инициализирует массив, вызывает quickSort и выводит отсортированный результат в консоль.
В общем, QuickSort - это алгоритм сортировки "разделяй и властвуй". Он выбирает опорный элемент, разделяет массив на две части и рекурсивно применяет процесс к каждой части до тех пор, пока массив не будет отсортирован. Функция partition важна для определения правильной позиции опорного элемента.
 */
