package somewhere;

import car.Cabriollet;
import car.Car;


public class Main {

    public static void main(String[] args) {
//        car.Car a = new car.Car(1, "BMW E34", "black", 0);
//        car.Car b = new car.Car(2, "Tesla X", "red", 0);

//        a.id = 1;
//        b.id = 2;


//        a.model = "BMW E34";
//        b.model = "Tesla X";
//
//        a.color = "Black";
//        a.currentSpeed = 0;

//        System.out.println(a.id);
//        System.out.println(b.id);

//        System.out.println(a.model);
//        System.out.println(b.model);
//
//        System.out.println(a.color);
//        System.out.println(b.color);

//        a.drift();
//        b.drift();
//
//        a.getInfo();
//        b.getInfo();
//        a.go(10)

//        a.currentSpeed = 50;
//        a.model = "Volvo";
//        a.id = 777;

//        a.getInfo();
//
//        a.setColor("yellow");
//        a.getInfo();
//
//        System.out.println("-----------");
//        System.out.println(a.getColor());
//        System.out.println("-----------");
//
//        System.out.println("Speed " + a.getCurrentSpeed());
//        a.setCurrentSpeed(100);
//        System.out.println("Speed " + a.getCurrentSpeed());
//        a.setCurrentSpeed(1000);
//        System.out.println("Speed " + a.getCurrentSpeed());
//
//
//        Car car = new Car(1, "BMW E34", "black", 0);
        Cabriollet cabriollet = new Cabriollet(2, "Tesla X", "red", 0,true);

//        car.drift();
        cabriollet.drift();
        cabriollet.isOpend = true;
        cabriollet.isOpend = false;

        Object object = new Object();

        System.out.println(cabriollet.hashCode());
//        System.out.println(car.hashCode());

//        System.out.println(car.equals(cabriollet));
//        System.out.println(car.equals(car));

        System.out.println(cabriollet);

        double a = 0.15;
        int b = 15;

//        car.changeCost(a);
//        car.changeCost(b);

//        Car mazda = new Car(1, "Mazda", "red", 3);



    }
}