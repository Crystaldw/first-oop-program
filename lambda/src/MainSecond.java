import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainSecond {

    public static void main(String[] args) {

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5;
            }
        };

        Supplier<Integer> supplier2 = () -> 5;

        int a = supplier.get();
        System.out.println(a);

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        BinaryOperator<Integer> binaryOperator1 = (x, y) -> x + y;


        UnaryOperator<Integer> unaryOperator = (x) -> x + 5;
        UnaryOperator<Integer> unaryOperator1 = (x) -> x * 2;
        UnaryOperator<Integer> unaryOperator2 = (x) -> x / 4;
        Predicate<Integer> predicate = (x) -> x > 10;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(50);
        list.add(500);

        List<Integer> answer = list.stream()
                .map((x) -> x + 5)
                .map((x) -> x * 2)
                .map((x) -> x / 4)
                .filter((x) -> x > 10)
                .toList();
        System.out.println(answer);


    }
}


