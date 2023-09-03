package somewhere;

import car.*;

import java.util.Scanner;

public class MainExample {

    public static void main(String[] args) {


//        Scanner scanner = new Scanner();
//        Car car = new Car();
        Car a = new Jeep(2, "", "", 0);
        Car b = new Cabriollet(1, "", "", 0, true);
        Jeep secindLandrover = new Jeep(3, "", "", 9);
        Cabriollet secondCabrio = new Cabriollet(1, "", "", 0, true);

//        Jeep[] jeeps = new Jeep[5];
//        Cabriollet[] cabriollets = new Cabriollet[5];
//        jeeps[0] = secindLandrover;
//        cabriollets[0] = secondCabrio;

        Car[] cars = new Car[2];
        cars[0] = a;
        cars[1] = b;

        for (Car car : cars) {
            car.startEngine();
        }


//        landrover.doSomething();
        secindLandrover.doSomething();


        a.drift();
        b.drift();

        Airplane airplane = new Airplane();
        Refuelable transport = new Airplane();
        Refuelable transportSecond = new Jeep(1, "", "", 0);
        Refuelable transportThird = new Cabriollet(1, "", "", 0, true);
        airplane.fly();
        airplane.refuel();

        Refuelable[] refuelables = new Refuelable[3];
        refuelables[0] = transport;
        refuelables[1] = transportSecond;
        refuelables[2] = transportThird;



        for (Refuelable refuelable : refuelables){
            refuelable.refuel();
        }

        Jeep landcruiser = new Jeep(1, "", "", 0);

        System.out.println(Jeep.getRecomendetSpeed());
    }


    public static void test(Car car){
        car.drift();
    }



}

