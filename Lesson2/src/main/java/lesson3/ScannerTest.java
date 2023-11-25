package lesson3;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String  name = scanner.nextLine();
//        System.out.println("Вы ввели :" + word);

        System.out.println("Введите пол");

        char gender = scanner.nextLine().charAt(0);

        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        System.out.println("Введите телефон");
        long phoneNumber = scanner.nextLong();

        System.out.println("Введите идентификатор");
        double id = scanner.nextDouble();

        System.out.println("Name: "+ name);
        System.out.println("Gender:"+ gender);
        System.out.println("Age:" + age);
        System.out.println("Phone:" + phoneNumber);
        System.out.println("ID:"+ id);

    }
}
