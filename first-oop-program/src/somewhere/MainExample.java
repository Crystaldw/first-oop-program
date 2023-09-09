package somewhere;

import car.*;

import java.util.Scanner;

public class MainExample {

    public static void main(String[] args) {

        Jeep secindLandrover = new Jeep();
        Car cabrio = new Cabriollet(1, "", "", 0, true);
        Cabriollet secondCabrio = new Cabriollet(1, "", "", 0, true);

        Car a = new Jeep();
        Car b = new Cabriollet(1, "", "", 0, true);


        test(a);
        test(b);

//         abriollets[0] = secondCabrio;

        Car[] cars = new Car[2];
        cars[0] = a;
        cars[1] = b;


        for (Car car : cars) {
            car.startEngine();
        }

        Airplane airplane = new Airplane();
        Refuelable transport = new Airplane();
        Refuelable transportSecond = new Jeep();
        Refuelable transportThird = new Cabriollet(1, "", "", 0, true);

        Refuelable[] refuelables = new Refuelable[3];
        refuelables[0] = transport;
        refuelables[1] = transportSecond;
        refuelables[2] = transportThird;

        for (Refuelable refuelable : refuelables) {
            refuelable.refuel();
        }

        System.out.println(Car.MAX_SPEED);

        System.out.println(Jeep.getRecomendetSpeed());

        System.out.println(Math.sqrt(36));




    }


    public static void test(Car car) {
        car.drift();
    }


}

