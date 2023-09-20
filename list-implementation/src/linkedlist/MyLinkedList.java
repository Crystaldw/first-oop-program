package linkedlist;

public class MyLinkedList {

    private Node head;

    public void add(int value) {
        
        if (head == null) {
            Node node = new Node();
            node.setValue(value);
            head = node;
        } else {
//            Node node = new Node();
//            node.setValue(value);
//            head.setNext(node);
//            node.setLast(head);
            Node currentNode = head;
            //перепрыгивать пока не наступит конец (ссылка на null)
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            Node node = new Node();
            node.setValue(value);
            currentNode.setNext(node);
            node.setLast(currentNode);

            //currentNode - последняя ячейка линкедЛиста
        }
    }

    public Node getHead() {
        return head;
    }
}
