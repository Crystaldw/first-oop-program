package somewhere;

import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack);
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack.pop());//LIFO последний элемент,
//        // добавленный в стек, будет первым, извлеченным (или
//        // использованным).
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//

//        String str1 = "()()";
//        String str2 = "((((((";
//        String str3 = "())(";
//        //к концу строки вложенность должна равняться 0
//
//        String str4 = "((4+5)*4+345";
//        String str5 = "()[]{}";
//        String str6 = "(]";
//        String str7 = "{4+5*[2*(2*(2+2))]}";
//        String str8 = "([)]";
//        String str11 = "([{}])";
//        String str12 = "(){}[]";
//        String str9 = "((((()))))";
//        String str10 = "(())";
//
//        String str = "((())))";

        System.out.println(checkString("(([]))"));
    }

    public static boolean checkString(String str) {  //получили строчку
        if (str == null) {
            return false;
        }
        boolean isCorrect = true; //установили что эта строчка нормальная тру}
        Stack<Character> stack = new Stack<>(); //создали пустой СТЕК
        for (int i = 0; i < str.length(); i++) { //проходимся по каждому символу этой строчки
            char symbol = str.charAt(i);

            if (symbol == '(') { //если символ ( то мы кладем его в СТЕК
                stack.push(symbol);
            }
            if ((symbol == ')') && (stack.isEmpty() || (stack.pop() != '('))) { //Если ) и СТЕК пустой или не (
                return false; // выводим ФОЛС
            }
            if (symbol == '[') { //если символ ( то мы кладем его в СТЕК
                stack.push(symbol);
            }
            if ((symbol == ']') && (stack.isEmpty() || (stack.pop() != '['))) { //Если ) и СТЕК пустой или не (
                return false; // выводим ФОЛС
            }
        }

        if (!stack.isEmpty()) { //если в результате предыдущего цикла в СТЕКе чтото осталось
            return false; // выводим ФОЛС
        }
        return stack.isEmpty(); // если все нормально ТРУ
    }
}

