package hwJAVA;
/*
В отдельном проекте:

Создать ArrayList. заполните его числами от 0 до 100
Создайте стрим, который будет делать следующие вещи:
1) Делит все числа на 2
2) Оставляет только те, которые больше, чем 25
3) Вычитает 30 из каждого числа
4) Сортирует
5) Выбирает только первых 5 элементов
6) подсчитывает сумму оставшихся элементов
Вывести результат на экран
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CreateStream {

    public static void main(String[] args) {
       int result = calculate();
        System.out.println(result);
    }

    public static int calculate() {
        List<Integer> list = new ArrayList<>();  //ArrayList. заполните его числами от 0 до 100

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Optional<Integer> result = list.stream()          //Создайте стрим
                .map(x -> x / 2) //Делит все числа на 2
                .filter(x -> x > 25) //Оставляет только те, которые больше, чем 25
                .map(x -> x - 30)    //Вычитает 30 из каждого числа
                .sorted()            //Сортирует
                .limit(5)   //Выбирает только первых 5 элементов
                .reduce(Integer::sum);  //подсчитывает сумму оставшихся элементов

        if (result.isPresent()){
            return result.get();
        }
else {
    return 0;
        }
    }
}
