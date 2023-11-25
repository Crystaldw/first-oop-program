package hwJAVA.hw1110;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

/*
В отдельном проекте создайте несколько реализаций функциональных интерфейсов
1) Functional. Принимает строку, находит в ней самый часто встречаемый символ и отдает ее
2) Supplier. Ничего не принимает, отдает случайно сгенерированную строку

Подсказки (читайте, только если не можете разобраться)
1) Ваша задача создать hashmap, в котором в качестве ключа будет символ, а в качестве значения - сколько
раз вы его встретили. Если символ новый, запишите его в хешмап со значением 1. Если уже есть, то
прибавьте к значению +1. Далее найдите символ с наибольшим числом и return его
2) Сгенерируйте первое число N (пусть от 0 до 100) - это будет длина строки. Далее N раз генерируйте
число от 0 до 25. Каждое сгенерированное число - это буква алфавита. (от 1 до 26 (от A до Z)).
Теперь по каждой цифре создавайте букву. Сделать это можно, например, создав HashMap в которой будет
связь число-буква. Или любыми другими способами


 */
public class Main {
    public static void main(String[] args) {
        System.out.println(mostPopularChar(""));
        System.out.println("Hello world!");
        System.out.println(randomString());

        Function<String, Character> function = (string) -> mostPopularChar(string);
        Supplier<String> supplier = ()-> randomString();

//        function.apply();

    }

    private static char mostPopularChar(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toLowerCase().toCharArray();
        for (char symbol : chars) {

            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                int count = map.get(symbol);
                count++;
                map.put(symbol, count);
            }
        }
//        System.out.println(map);
//        return 'a';

//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//    }

        int maxCount = 0;
        char symbol = 0;

        for (Character character : map.keySet()) {
            int count = map.get(character);
            if (count > maxCount) {
                maxCount = count;
                symbol = character;
            }
        }
        return symbol;
    }

    private static String randomString(){
        Random random = new Random();
        int randomSize = random.nextInt(10, 100);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < randomSize; i++) {
            int additionalNumber = random.nextInt(0, 26);
            char symbol = (char) ('a' + additionalNumber);
            result.append(symbol);
        }
        return result.toString();

    }

}

