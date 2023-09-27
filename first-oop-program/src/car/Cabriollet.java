package car;

public class Cabriollet extends Car implements Refuelable, Comparable<Cabriollet> {

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

    @Override
    public int compareTo(Cabriollet o) {
        String mogel = getModel();
        String anotherModel = o.getModel();

        if (mogel == null) {
            return -1;
        }

        if (anotherModel == null) {
            return 1;
        }
        if (mogel.length() > anotherModel.length()) {
            return 1;
        }
        if (mogel.length() < anotherModel.length()) {
            return -1;
        }

        return mogel.compareTo(anotherModel);
    }
}

