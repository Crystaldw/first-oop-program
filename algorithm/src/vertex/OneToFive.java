package vertex;

import java.util.Scanner;

public class OneToFive {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
            for (int a = 1; a <= 10; a++) {
                System.out.println("    Это второй цикл! Я выполняюсь " + a + " раз");
                if (a == 2)
                    break;
            }
        }

        for (int i = 1; i < 7; i++) {
            System.out.println(i + ": я выполняюсь перед continue");
            if (i > 2)
                continue;
            System.out.println("      " + i + ": я выполняюсь всего два раза :( ");

        }
        int x = 3 + (int)  Math.random() * 4;
        System.out.println(x);
    }
}
