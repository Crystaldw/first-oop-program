package homework;

public class CountOccurrences {

    public static int countOccurrencesIterative(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrencesRecursive(String str, char ch) {
        // Базовый случай: если строка пуста, возвращаем 0
        if (str.isEmpty()) {
            return 0;
        }

        // Если первый символ строки совпадает с искомым символом, увеличиваем счетчик на 1
        if (str.charAt(0) == ch) {
            return 1 + countOccurrencesRecursive(str.substring(1), ch);
        } else {
            // В противном случае рекурсивно вызываем функцию для оставшейся части строки
            return countOccurrencesRecursive(str.substring(1), ch);
        }
    }

    public static void main(String[] args) {
        //Итеративный метод
        String inputString = "hello world";
        char character = 'l';
        int result = countOccurrencesIterative(inputString, character);
        System.out.println("Количество вхождений символа '" + character + "' в строку: " + result);
        System.out.println();
        System.out.println("____________________________");
        System.out.println();

        //Рекурсивный метод
        String inputStringSecond = "hello world";
        char characterSecond = 'l';
        int resultSecond = countOccurrencesRecursive(inputStringSecond, characterSecond);
        System.out.println("Количество вхождений символа '" + characterSecond + "' в строку: " + resultSecond);
    }
}
