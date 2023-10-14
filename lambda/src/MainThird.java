import java.util.function.Function;
import java.util.function.Supplier;

public class MainThird {

    public static void main(String[] args) {

        Function<Double, Double> function = (x) -> Math.floor(x);

        System.out.println(function.apply(-0.3));

        Function<Double, Double> secondFunction = (t) -> t + 0.5;

        System.out.println(secondFunction.apply(5.0));

        Function<Integer, Integer> thirdFunction = (x) -> {
            int result = 0;
            for (int i = 0; i <= x; i++) {
                result += i;
            }
            return result;
        };
        System.out.println(thirdFunction.apply(100));

        int[] a = {1};

        Supplier<Integer> integerSupplier = () -> a[0];


        a[0]=2;


        System.out.println(integerSupplier.get());

    }
}
