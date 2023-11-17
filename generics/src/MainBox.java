public class MainBox {

    public static void main(String[] args) {

        Box<Integer, String> box = new Box<>();
        box.value = 5;
        box.secondValue = "5";

        System.out.println(box.value);
    }
}
