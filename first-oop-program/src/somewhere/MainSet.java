package somewhere;

import car.Cabriollet;
import car.EngineType;
import car.GasStation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
//        Set<String> children = new HashSet<>();
//        children.add("Ivan");
//        children.add("Andrei");
//        children.add("Anton");
//        children.add("Elena");
//        children.add("Angela");
//
//        Set<Integer>numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(1455);
//        numbers.add(1888);
//        numbers.add(12323333);
//        numbers.add(100000000);
//
//        System.out.println(children);
//        System.out.println(numbers);


        GasStation gasStation = new GasStation();


        List<Cabriollet> cabriollets = new ArrayList<>();
        Cabriollet cabriolletfirst = new Cabriollet(1, "bmw", "black", 0, true);
        cabriolletfirst.setEngineType(EngineType.GAS);
        Cabriollet cabriolletSecond = new Cabriollet(1, "bmw", "black", 0, true);
        cabriolletSecond.setEngineType(EngineType.ELECTRRO);
        cabriollets.add(cabriolletfirst);
        cabriollets.add(cabriolletSecond);

        gasStation.setCabriollets(cabriollets);

        Set<EngineType> engineTypes = new HashSet<>();
        engineTypes.add(EngineType.DIESEL);
        engineTypes.add(EngineType.GAS);
        engineTypes.add(EngineType.MECHANIC);

        gasStation.setAvaliableEngineTypes(engineTypes);

        gasStation.refuelAll();
    }
}
