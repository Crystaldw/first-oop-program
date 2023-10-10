package somewhere;

import car.Cabriollet;
import car.Car;
import car.Jeep;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainLambda {

    public static void main(String[] args) {
        Jeep jeep = new Jeep();
        Car car = new Cabriollet(1, "", "", 1, true);


        Car volvo = new Car() {
            @Override
            public void drift() {
                System.out.println("Особенный дрифт");

            }
        };
        Car bmw = new Car() {
            @Override
            public void drift() {

            }
        };
        System.out.println(volvo.getClass());
        System.out.println(bmw.getClass());
        volvo.drift();

        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Как дела");
        list.add("Как жизнь");

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
                System.out.println("Вы хотели написать вот эту строку...");
            }
        };

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            stringConsumer.accept(str);
        }

        Function<String, Jeep> jeepFunction = new Function<String, Jeep>() {
            @Override
            public Jeep apply(String s) {
                Jeep jeep = new Jeep();
                jeep.setModel(s);
                return jeep;
            }
        };
        Jeep jeepVolvo = jeepFunction.apply("VOLVO");

        System.out.println(jeepVolvo);
        for (int i = 0; i < list.size(); i++) {
            Jeep jeep1 = jeepFunction.apply(list.get(i));
            System.out.println(jeep1);
        }
    }
}
