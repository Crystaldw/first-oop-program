package somewhere;

import car.*;

public class MainGasStation {

    public static void main(String[] args) {
        Jeep jeep = new Jeep();
        Cabriollet cabriollet = new Cabriollet(1,"","",0,true);
        GasStation gasStation = new GasStation();
        Airplane airplane = new Airplane();
        Ship ship = new Ship();

        gasStation.refuel(jeep);
        gasStation.refuel(cabriollet);
        gasStation.refuel(airplane);
        gasStation.refuel(ship);
        System.out.println(Types.AI);

//        jeep.setType(TransmisionType.MECHANIC);
//        cabriollet.setType(TransmisionType.AUTO);
        System.out.println(jeep.getType());
    }
}
