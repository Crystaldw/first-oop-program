package car;

public class Ship implements Refuelable {

    @Override
    public void refuel() {
        System.out.println("Для этого большого корабля нужно много топлива");
    }
}
