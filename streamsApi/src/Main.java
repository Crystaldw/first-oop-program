import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random(123);

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        //1) Сначала все числа умножить на 2
        //2) отсортировать те числа, которые меньше 50
        //3) отнять 10 поделить на 4

        System.out.println(list);


        List<Integer> firstStep = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            value *= 2;
            firstStep.add(value);
        }

        System.out.println(firstStep);


        List<Integer> secondStep = new ArrayList<>();

        for (int i = 0; i < firstStep.size(); i++) {
            if (firstStep.get(i) >= 50) {
                secondStep.add(firstStep.get(i));
            }
        }

        System.out.println(secondStep);


        List<Integer> thirdStep = new ArrayList<>();

        for (int i = 0; i < secondStep.size(); i++) {
            int value = secondStep.get(i);
            value -= 10;
            value /= 4;
            thirdStep.add(value);
        }

        System.out.println(thirdStep);


        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            value *= 2;
            if (value >= 50) {
                value -= 10;
                value /= 4;
                answer.add(value);
            }
        }

        System.out.println(answer);

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");

//        List<Integer> result = list.stream()
//                .map((x) -> x * 2)
//                .filter((x) -> x >= 50)
//                .map((x) -> (x - 10) / 4)
//                .toList();
//
//        System.out.println(result);

        //конвеерные
        //метод мар - изменить все элементы стрима
        //filter() - фильтрует элементы. Оставляет только те которые соответствуют условиям
        //sorted() - сортирует стрим
        //distinct() - удаляет повторяющиеся элементы
        //skip() - пропускает элементы
        //peek() - сделать чтото с элементом не измемняя его

        //терминальные
        //forEach()- произвести любые действия с элементами и завершить стрим
        //toList()- превращает ваш стрим в лист
        //count()- возвращает число элементов


        List<String> answerList = list.stream()
                .map(x -> x.toString())
                .map(x -> x + "qwerty")
                .toList();

        System.out.println(list);

        List<Integer> result = list.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .distinct()
                .skip(2)
                .limit(5)
                .peek(x -> x = x + 1)
                .toList();

        System.out.println(result);

        long x = list.stream()
                .filter(y -> y > 20)
                .count();

        System.out.println(x);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);

        int size = list.size();

        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        int sumInt = sum.get();
        System.out.println(sumInt / size);


        Optional<Integer> optional = set.stream().reduce((a, b) -> a * b);
        int resultInt = optional.get();
        System.out.println(resultInt);


        Optional<Integer> optionalInteger = list.stream().findFirst();
        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        }
        Optional<Integer> any = list.stream().findAny();
        if ((any.isPresent())) {
            System.out.println(any.get());
        }
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        if (min.isPresent()) {
            System.out.println(min.get());
        }

        boolean anyMatch = list.stream().anyMatch(integer -> integer > 5);
        System.out.println(anyMatch);

        boolean allMatch = list.stream().allMatch(integer -> integer > 5);
        System.out.println(allMatch);


//        Object[] array = list.stream().toArray();

        Set<Integer>collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}