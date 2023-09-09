package car;

public class Jeep extends Car implements Refuelable{

    @Override
    public void drift() {
        System.out.println("Jeep не дрифтит");
    }
    public void doSomething(){
        System.out.println("Тестовое сообщение");
    }

    @Override
    public void refuel() {
        setFuel(100);
        System.out.println("Джип заправили ДТ");
    }

    public static int getRecomendetSpeed(){
        return MAX_SPEED /2;
    }
}
