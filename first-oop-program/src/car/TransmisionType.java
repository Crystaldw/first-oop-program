package car;

public enum TransmisionType {

    AUTO(1.3),
    MECHANIC(1.0),
    AI(2.0);

    private final double coeficientOfCost;

    TransmisionType(double coeficientOfCost) {
        this.coeficientOfCost = coeficientOfCost;
    }

    public double getCoeficientOfCost() {
        return coeficientOfCost;
    }

    public boolean isNotAI() {
        return !this.equals(AI);
    }

    public boolean isAutoOrMechanic() {
        return this.equals(AUTO)||this.equals(MECHANIC);
    }

    public boolean isAuto(){
        return this.equals(AUTO);
    }
}
