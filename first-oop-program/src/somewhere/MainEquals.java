package somewhere;

import car.Car;

public class MainEquals {

    public static void main(String[] args) {

        Car bmw = new Car(1, "bmw", "black", 0);
        Car volvo = new Car(2, "Volvo", "red",0);
        Car toyota = new Car(1, "bmw", "black", 0);
        System.out.println(bmw.equals(toyota));
        System.out.println(bmw.equals(volvo));
        System.out.println(bmw.equals(bmw));

        System.out.println("--------------");

        String first = new String("a");
        String second = new String("a");
        System.out.println(first==second);
        System.out.println(first.equals(second));

    }
}
