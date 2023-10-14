package person;

import java.util.Objects;

public class Pensioner extends Person {

    private Double pension;

    public Pensioner(String name, int age, int height, double weight, double money, Double pension) {
        super(name, age, height, weight, money);
        this.pension = pension;
    }

    public Double getPension() {
        return pension;
    }

    public void setPension(Double pension) {
        this.pension = pension;
    }


    @Override
    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он зарабоотал: " + x);
    }

    @Override
    public void die(int years) {
        System.out.println("Этот пенсионер умрет через " + years + " лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pensioner pensioner = (Pensioner) o;

        return Objects.equals(pension, pensioner.pension);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pension != null ? pension.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}
