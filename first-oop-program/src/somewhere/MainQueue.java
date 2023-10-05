package somewhere;

import java.util.*;

public class MainQueue {

    public static void main(String[] args) {

        //ArrayDeque - очередьб в которой элементы распологаются в порядке их складывания в очередь
        //PriorityQueue - очередь в которой элементы распологаются в порядке возрастания

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Petrov");
        queue.add("Sidorov");
        queue.add("Ivanov");

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Queue<Integer> queue1 = new ArrayDeque<>();

        Queue<Integer> integersQueue = new LinkedList<>();
        Deque<Integer> integersDeque = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        integersQueue.add(1);
        integersQueue.add(2);
        integersDeque.add(1);
        integersDeque.add(2);
        linkedList.add(1);
        linkedList.add(2);

        System.out.println(integersQueue.poll());

        System.out.println(integersDeque.poll());
        System.out.println(integersDeque.pollFirst());
        System.out.println(integersDeque.pollLast());

        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());


    }
}
