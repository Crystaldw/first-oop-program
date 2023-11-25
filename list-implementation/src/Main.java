import linkedlist.MyLinkedList;
import linkedlist.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //arrayList

        // основе лежит массив
        // когда массив переполняется, создаем массив в 1.5 раза больше
        // начальный размер массива = 10
        // все элементы имеют индексы

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);


        MyArrayList a = new MyArrayList();
//
        a.add(1);
        a.add(2);
        //
        a.add(100);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(700);
        a.add(8);


        System.out.println(a);

        a.add(2, 50);
        a.add(-10);

        System.out.println(a);

        a.remove(2);

        System.out.println(a);
//
        //System.out.println(a);
        //System.out.println(a.contains(701));
//
        //MyLinkedList myLinkedList = new MyLinkedList();
        //myLinkedList.add(2);
        //myLinkedList.add(3);
        //myLinkedList.add(4);
        //myLinkedList.add(5);
//
        //System.out.println(myLinkedList);
//
        //Node head = myLinkedList.getHead();
        //System.out.println(head);
        //System.out.println(head.getNext());
        //System.out.println(head.getNext().getNext());
        //System.out.println(head.getNext().getNext().getNext());





    }
}