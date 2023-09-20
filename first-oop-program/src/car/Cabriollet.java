package car;

public class Cabriollet extends Car implements Refuelable {

    public boolean isOpend;

    private EngineType engineType;

    public Cabriollet(int id, String model, String color, int currentSpeed, boolean isOpend) {
        super(id, model, color, currentSpeed);
        this.isOpend = isOpend;
    }

    @Override
    public void drift() {
        System.out.println("Кабриолет не для дрифта, грязь залетела через открытое окно...");
    }

    @Override
    public void refuel() {
        System.out.println("кабриолет зарпавили бензином с высоким октановым числом, 95+");
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}

