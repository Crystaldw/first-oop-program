package hwAlgorithms;
/*
Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком, такие как push(), pop(), isEmpty(), … и
дополнительную операцию getMin(), которая должна возвращать минимальный элемент из SpecialStack.

При этом взаимодействия со стеком в функции getMin() должно происходить через push и pop, а также после того как функция getMin()
найдет минимальный элемент нужно восстановить стек в изначальное состояние (например у вас был стек и так как вы перебирали все элементы
в нем черезе pop вы изменяли его ибо pop удаляет при доставании элемент из стека, поэтому в процессе перебирания вам необходимо достанные
элементы куда-то сохранять и после того как вы все переберете и найдете минимальный элемент вам нужно вернуть все
значения на свои места в стеке)
 */

import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> stack;
    private int minElement;

    public SpecialStack() {
        this.stack = new Stack<>();
        this.minElement = Integer.MAX_VALUE;
    }

    public void push(int value) {
        if (value <= minElement) {
            // Сохраняем предыдущий минимальный элемент перед обновлением
            stack.push(minElement);
            minElement = value;
        }
        stack.push(value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int poppedValue = stack.pop();

        // Если достаём минимальный элемент, восстанавливаем предыдущий минимальный элемент
        if (poppedValue == minElement) {
            minElement = stack.pop();
        }

        return poppedValue;
    }

    public int getMin() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int currentMin = minElement;

        // Восстанавливаем стек после поиска минимального элемента
        while (!stack.isEmpty()) {
            int value = stack.pop();
            if (value == minElement) {
                // Если достаём минимальный элемент, восстанавливаем предыдущий минимальный элемент
                minElement = stack.pop();
            }
        }

        return currentMin;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();

        specialStack.push(3);
        specialStack.push(5);
        specialStack.push(2);
        specialStack.push(1);

        System.out.println("Min element: " + specialStack.getMin());

        specialStack.pop();
        System.out.println("Min element: " + specialStack.getMin());

        specialStack.pop();
        System.out.println("Min element: " + specialStack.getMin());
    }
}

