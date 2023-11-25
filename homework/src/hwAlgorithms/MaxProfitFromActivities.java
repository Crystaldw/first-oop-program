package hwAlgorithms;
/*
Реализуйте задачу: максимальная выгода от активностей, второстепенно заполняемость по времени
зал для конференций работает с 9:00 до 17:00
час с 9:00 до 13:00 стоит 1 единицу
час с 13:00 до 17:00 стоит 2 единицы
например с 11 до 14 стоит 2 + 2 = 4 ед
например с 12 до 16 стоит 1 + 6 = 7 ед

========================================

Для решения этой задачи мы можем использовать жадный алгоритм.
Он заключается в том, чтобы на каждом шаге выбирать лучший вариант, основываясь на текущих условиях,
без учета будущих шагов. В данном случае, мы будем рассматривать активности по порядку и выбирать те,
которые приносят максимальную выгоду в данный момент.

========================================================

В этом примере создаются объекты Activity, представляющие собой активности с определенными временными интервалами
и стоимостью. Затем они сортируются по времени окончания, и применяется жадный алгоритм для выбора максимальной выгоды.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Activity implements Comparable<Activity> {
    int start;
    int end;
    int value;

    public Activity(int start, int end, int value) {
        this.start = start;
        this.end = end;
        this.value = value;
    }

    @Override
    public int compareTo(Activity other) {
        return Integer.compare(this.end, other.end);
    }
}

public class MaxProfitFromActivities {
    public static int maxProfit(List<Activity> activities) {
        // Сортируем активности по времени окончания
        Collections.sort(activities);

        int n = activities.size();
        int[] dp = new int[n]; // dp[i] хранит максимальную выгоду, которую можно получить до i-ой активности

        for (int i = 0; i < n; i++) {
            dp[i] = activities.get(i).value; // Начальное значение - выгода от текущей активности

            for (int j = 0; j < i; j++) {
                // Проверяем все активности, которые заканчиваются до начала текущей активности
                // и выбираем максимальную выгоду
                if (activities.get(j).end <= activities.get(i).start) {
                    dp[i] = Math.max(dp[i], dp[j] + activities.get(i).value);
                }
            }
        }

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            // Находим максимальную выгоду среди всех возможных вариантов
            maxProfit = Math.max(maxProfit, dp[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(9, 13, 1));
        activities.add(new Activity(11, 14, 2));
        activities.add(new Activity(12, 16, 1));
        activities.add(new Activity(14, 17, 2));

        int result = maxProfit(activities);
        System.out.println("Максимальная выгода: " + result);
    }
}

