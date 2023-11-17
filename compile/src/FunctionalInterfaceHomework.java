import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceHomework {
    public static void main(String[] args) {

/*
1 уровень сложности: В отдельном проекте создайте несколько реализаций функциональных
интерфейсов с помощью лямбда выражений

1) Functional. Принимает строку, а отдает ее размер
2) BinaryOperator - принимает две строки, отдает строку - результат сложения двух строк
3) Supplier. Ничего не принимает, отдает случайно сгенерированное число
4) Consumer. Принимает число, пишет на экран "привет" количество раз, равное числу
 */

        Function<String, Integer> function = (str) -> str.length();

        int result = function.apply("Привет");
        System.out.println(result);

        BinaryOperator<String> binaryOperator = ((string, string2) -> string + string2);

        String result1 = binaryOperator.apply("123", "456");
        System.out.println(result1);


        Supplier <Integer> supplier = ()->new Random().nextInt(-50, 50);
        int integer = supplier.get();
        System.out.println(integer);

        Consumer<Integer> consumer =(value)->{
            for (int i = 0; i < value; i++) {
                System.out.println("Привет ");
            }
        };

        consumer.accept(100);
    }
}