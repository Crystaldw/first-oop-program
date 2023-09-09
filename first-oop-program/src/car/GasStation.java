package car;

public class GasStation {

    public void refuel(Refuelable a){
        System.out.println("К заправке подьехал " + a.toString());
        a.refuel();
    }

}
