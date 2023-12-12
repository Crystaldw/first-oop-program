package hwJAVA.hw2709;


import java.util.Stack;

/*
Задачу решить в отдельном проекте
Школьники Вася и Петя играют в шпионов. Вася передает сообщение Пете. Для этого
он разбивает последовательность
букв на пятерки и переворачивает порядок букв в этих пятерках. Например:
"Привет, мир" ->"(Приве)(т, ми)р" ->"евирпим, тр"
Ваша задача, используя Stack восстановить последовательность букв (можно не
составлять строку, достаточно буквы по одной выводить на экран
 */
public class SpyMessage {
    public static void main(String[] args) {
        String encodedMessage = "(Приве)(т, ми)р";
        decodeMessage(encodedMessage);
    }

    private static void decodeMessage(String encodedMessage) {
        // Создаем стек для хранения символов
        Stack<Character> stack = new Stack<>();

        // Итерируем по каждому символу в закодированном сообщении
        for (char ch : encodedMessage.toCharArray()) {
            if (ch == ')' || ch == '(') {
                // Создаем StringBuilder для формирования перевернутого слова
                StringBuilder stringBuilder = new StringBuilder();

                // Извлекаем буквы из стека и добавляем к текущему слову в обратном порядке
                while (!stack.isEmpty() && stack.peek() != '(' && stack.peek() != ')') {
                    stringBuilder.append(stack.pop());
                }

                // Выводим перевернутое слово
                System.out.print(stringBuilder.reverse().toString());
            } else {
                // Если символ не скобка, помещаем его в стек
                stack.push(ch);
            }
        }

        // Выводим оставшиеся символы из стека
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
 }
