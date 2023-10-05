package somewhere;

import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {
//        Stack<Integer>stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack);
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack);
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack);

        String str0 = "(())(())))((())))()";
        String str1 = "()()()()";
        String str2 = "((((";
        String str3 = "())(";

        //к концу строки - вложенность должна равняться 0

        String str4 = "((4+5)+4+345)";

        String str5 = "()[]{}";
        String str6 = "(]";
        String str7 = "{4+5*[2*(2+2)]}";
        String str8 = "([)]";

        String str = "((((()))))";

    }

    public static boolean checkString(String str) {
        boolean isCorrect = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (symbol == '(') {
                stack.push(symbol);
            }

            if ((symbol == ')') && (stack.isEmpty() || (stack.pop() != '('))) {
                return false;
            }

            if ((symbol == ']') && (stack.isEmpty() || (stack.pop() != '['))) {
                return false;

            }
        }
        return stack.isEmpty();
    }
}
