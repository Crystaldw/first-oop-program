public class HomeWorkMain {
    /*
  Необходимо реализовать на джава такой граф -
  https://kpolyakov.spb.ru/school/test10bu/4_files/numway2.gif
  Задание со звездочкой (не сложное, просто дополнительное) Решите на бумаге задачу:
  http://waksoft.susu.ru/wp-content/uploads/2021/10/graph-schame.jpg
  Найдите самый короткий путь из Рейкявика в Афины
   */
    public static void main(String[] args) {

        Node node = new Node("А");
        Node node1 = new Node("Б");
        Node node2 = new Node("В");
        Node node3 = new Node("Г");
        Node node4 = new Node("Д");
        Node node5 = new Node("Е");
        Node node6 = new Node("Ж");
        Node node7 = new Node("З");
        Node node8 = new Node("И");
        Node node9 = new Node("К");

        node.add(node1);
        node.add(node2);
        node.add(node3);
        node.add(node4);

        node1.add(node2);
        node1.add(node5);

        node2.add(node6);

        node3.add(node2);
        node3.add(node7);

        node4.add(node3);
        node4.add(node8);

        node5.add(node9);

        node6.add(node7);
        node6.add(node9);

        node7.add(node9);

        node8.add(node9);


    }
}
