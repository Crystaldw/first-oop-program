package car;

public class Jeep extends Car implements Refuelable{

    public Jeep(int id, String model, String color, int currentSpeed) {
        super(id, model, color, currentSpeed);
    }

    @Override
    public void drift() {
        System.out.println("Jeep не дрифтит");
    }
    public void doSomething(){
        System.out.println("Super!!");
    }

    @Override
    public void refuel() {
        System.out.println("Джип заправили ДТ");
    }

    public static int getRecomendetSpeed(){
        return MAX_SPEED /2;
    }
}
