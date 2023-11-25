package hwAlgorithms;

/*
Расписать подробно каждую строчку этого кода комментариями или самостоятельно реализовать решение задачи:
Дан массив положительных целых чисел и целевое число target. Необходимо найти самую короткую подпоследовательность
чисел в массиве, сумма которых равна target. Верните эту самую короткую подпоследовательность.

 */
import java.util.List;

public class Window {

    // Метод для поиска самой короткой подпоследовательности чисел, сумма которых равна target
    public static void findShortestArray(List<Integer> arrayList, int targetSum) {
        int leftBorder = 0; // Левая граница текущего окна
        int rightBorder = 0; // Правая граница текущего окна
        int sum = 0; // Текущая сумма чисел в окне

        int minLength = Integer.MAX_VALUE; // Изначально устанавливаем длину на максимальное значение
        int answerLeftBorder = 0; // Левая граница ответа (начальное значение)
        int answerRightBorder = 0; // Правая граница ответа (начальное значение)

        // Итерация по массиву с использованием двух указателей (левого и правого)
        while (rightBorder < arrayList.size()) {
            sum += arrayList.get(rightBorder); // Добавляем элемент в текущее окно
            while (sum >= targetSum) { // Если сумма в окне стала больше или равна targetSum
                int windowLength = rightBorder - leftBorder + 1; // Длина текущего окна
                if (windowLength < minLength && sum == targetSum) { // Проверка на минимальность и равенство суммы targetSum
                    answerLeftBorder = leftBorder; // Обновляем левую границу ответа
                    answerRightBorder = rightBorder; // Обновляем правую границу ответа
                    minLength = windowLength; // Обновляем минимальную длину
                }
                sum -= arrayList.get(leftBorder); // Убираем элемент из окна
                leftBorder++; // Сдвигаем левую границу окна
            }
            rightBorder++; // Сдвигаем правую границу окна
        }

        // Выводим ответ, если найдена короткая подпоследовательность
        if (minLength != Integer.MAX_VALUE) {
            for (int i = answerLeftBorder; i <= answerRightBorder; i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    // Точка входа в программу
    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1, 1, 1, 2, 4, 5);

        findShortestArray(arrayList, 3);
    }
}

