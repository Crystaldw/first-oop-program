import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        decode("123456789");
    }

    public static void decode(String code) {
        if (code == null) {
            return;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            char symbol = code.charAt(i);
            stack.push(symbol);
            if (stack.size() == 5 || i == code.length() - 1) {
                while (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
            }
        }

        System.out.println(stack);

    }

    //Задачу решить в отдельном проекте
    //
    //Школьники Вася и Петя играют в шпионов. Вася передает сообщение Пете. Для этого он разбивает последовательность букв на пятерки и переворачивает порядок букв в этих пятерках. Например:
    //"Привет, мир" ->"(Приве)(т, ми)р" ->"евирпим, тр"
    //
    //Ваша задача, используя Stack восстановить последовательность букв (можно не составлять строку, достаточно буквы по одной выводить на экран
}