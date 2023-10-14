package person;

import java.util.Objects;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private final static double PENSION_COEFFICIENT = 0.25;
    private final static double ADDITIONAL_COEFFICIENT = 1.05;
    private final static int COUNT_OF_PROFS = 3;

    private int minSalary; //минимальная зарплата
    private int maxSalary; //максимальная зарплата
    private Set<Proffession> proffessions;

    public Worker(String name, Gender gender, int age, int height, double weight, double money, int minSalary, int maxSalary) {
        super(name, gender, age, height, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }


    public Worker(String name, int height, double weight, double money, int minSalary, int maxSalary) {
        super(name, 0, height, weight, money);
    }

    public Worker(String name, int age) {
        super(name, age, 0, 0, 0);
    }

    public Worker(int minSalary, int maxSalary) {
        super(null, 0, 0, 0, 0);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(Gender gender, int minSalary, int maxSalary) {
        super(null, gender, 0, 0, 0, 0);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;


    }


    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = (int) minSalary;
    }

    public Double getMaxSalary() {
        System.out.println("Максимальная зарплата: " + maxSalary);
        return (double) maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = (int) maxSalary;
    }

    public Set<Proffession> getProffessions() {
        return proffessions;
    }

    public void setProffessions(Set<Proffession> proffessions) {
        this.proffessions = proffessions;
    }

    @Override
    public double calculatePension() {
        Gender gender = getGender();

        if (getGender() == null) {
            return 0.0;
        }
        double averageSalary;
        if (getGender() == Gender.MALE) {
            averageSalary = CalculatorUtils.calculateAverage(minSalary, maxSalary);
        } else {
            averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2);
        }

        double aditionalMoney = 0.0;

        if (proffessions != null) {
            int countProffessions = proffessions.size();
            aditionalMoney = countProffessions / COUNT_OF_PROFS * ADDITIONAL_COEFFICIENT;
        }


        return averageSalary * PENSION_COEFFICIENT * aditionalMoney;
    }


    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + " лет.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (!Objects.equals(minSalary, worker.minSalary)) return false;
        return Objects.equals(maxSalary, worker.maxSalary);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + minSalary;
        result = 31 * result + maxSalary;
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSolary=" + minSalary +
                ", maxSolary=" + maxSalary +
                '}';
    }

    public void swtMaxSalary(int i) {
    }
}
