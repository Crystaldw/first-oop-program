public class Main {

    public static void main(String[] args) {
        Node firstNode = new Node("Петр");
        Node secondNode = new Node("Вася");
        Node thirdNode = new Node("Коля");
        Node fourthNode = new Node("Антон");

        firstNode.add(secondNode);
        firstNode.add(thirdNode);

        secondNode.add(thirdNode);
        secondNode.add(firstNode);

        Node result = firstNode.get("Вася");

        System.out.println(result);

        Node answer = result.get("Петр");
        System.out.println(answer);

        answer = answer.get("Вася");

        System.out.println(answer);
    }

}