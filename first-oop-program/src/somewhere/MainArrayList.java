package somewhere;

import car.Cabriollet;
import car.GasStation;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        List<Cabriollet> cabriolets = new ArrayList<>();

        Cabriollet firstCabriolet = new Cabriollet(1, "BMW", "black", 0, false);
        Cabriollet secondCabriolet = new Cabriollet(2, "Volvo", "yellow", 0, true);

        cabriolets.add(firstCabriolet);
        cabriolets.add(secondCabriolet);

        gasStation.setCabriollets(cabriolets);

        gasStation.printInfoAboutQueue();

        gasStation.refuelAll();

    }
}
