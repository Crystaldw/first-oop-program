package somewhere;

import car.Cabriollet;
import car.GasStation;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainGasStationQueue {

    public static void main(String[] args) {

        GasStation gasStation = new GasStation();
        Cabriollet cabriollet = new Cabriollet(1, "bmw", "black", 0, true);
        Cabriollet cabriollet1 = new Cabriollet(2, "bmw", "black", 0, true);
        Cabriollet cabriollet2 = new Cabriollet(3, "bmw", "black", 0, true);
        Cabriollet cabriollet3 = new Cabriollet(4, "bmw", "black", 0, true);

        Queue<Cabriollet> cabriollets = new ArrayDeque<>();
        cabriollets.add(cabriollet3);
        cabriollets.add(cabriollet);
        cabriollets.add(cabriollet1);
        cabriollets.add(cabriollet2);

        gasStation.setCabriolletQueue(cabriollets);

        gasStation.refuelNext();
        gasStation.refuelNext();
        gasStation.refuelNext();

        
    }
}
