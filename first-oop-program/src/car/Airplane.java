package car;

public class Airplane implements Refuelable{

    private String type;
    private String serialNumber;

    @Override
    public void refuel() {
        System.out.println("Самолет заправляют только керосином + бензином АИ100");
    }
    public void fly(){
        System.out.println("Лети");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
