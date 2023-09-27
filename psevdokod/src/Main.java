//        1. Ввод первого числа (num1)
//        2. Ввод второго числа (num2)
//        3. Ввод третьего числа (num3)
//        4. Сумма = num1 + num2 + num3
//        5. Вывод суммы

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int result = num1 + num2 + num3;
        System.out.println("Сумма трех чисел равна " +result);

    }
}