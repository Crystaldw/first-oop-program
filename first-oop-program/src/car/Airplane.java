package car;

public class Airplane implements Refuelable{

    private String type;
    private String serialNumber;

    @Override
    public void refuel() {
        System.out.println("Самолет заправляют только керосином");
    }
    public void fly(){
        System.out.println("Лети");
    }
}
