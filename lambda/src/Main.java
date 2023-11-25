import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String result = s + s;
                System.out.println(result);
            }
        };

        consumer.accept("Privet");
        consumer.accept("Kak dela");

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        };
        int answer = function.apply(5);
        System.out.println(answer);


        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 10;
            }
        };
        boolean result = predicate.test(20);
        System.out.println(result);


        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5;
            }
        };
        int a = supplier.get();
        System.out.println(a);


        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        int b = binaryOperator.apply(5,6);
        System.out.println(b);



        UnaryOperator<Integer>unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer/2;
            }
        };

        int c = unaryOperator.apply(5);
        System.out.println(c);
    }
}