import java.util.Objects;

public class Pensioner extends Person{

    private int pension;

    public Pensioner(String naame, int age, double weight, int height) {
        super(naame, age, weight, height);
    }

    @Override
    public void die() {
        int age = getAge();
        int result = (age - 50) * pension;
        System.out.println("Этот пенсионер умерб он заработал: " + result);
    }

    @Override
    public void die(int years) {
        System.out.println("Зтот пенсионер умрет через " + years + " лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pensioner pensioner = (Pensioner) o;
        return pension == pensioner.pension;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pension);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}
