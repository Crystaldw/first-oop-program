package person;

import java.util.Objects;

public class Worker extends Person {

    private Double minSolary; //минимальная зарплата
    private Double maxSolary; //максимальная зарплата

    public Worker(String name, int age, int height, double weight, double money, Double minSolary, Double maxSolary) {
        super(name, age, height, weight, money);
        this.minSolary = minSolary;
        this.maxSolary = maxSolary;
    }

    public Worker(String name, int height, double weight, double money, Double minSolary, Double maxSolary) {
        super(name, 0, height, weight, money);
    }

    public Worker(String name, int age) {
        super(name, age, 0, 0, 0);
    }

    public Double getMinSolary() {
        return minSolary;
    }

    public void setMinSolary(Double minSolary) {
        this.minSolary = minSolary;
    }

    public Double getMaxSolary() {
        System.out.println("Максимальная зарплата: " + maxSolary);
        return maxSolary;
    }

    public void setMaxSolary(Double maxSolary) {
        this.maxSolary = maxSolary;
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

        if (!Objects.equals(minSolary, worker.minSolary)) return false;
        return Objects.equals(maxSolary, worker.maxSolary);
    }

    @Override
    public int hashCode() {
        int result = minSolary != null ? minSolary.hashCode() : 0;
        result = 31 * result + (maxSolary != null ? maxSolary.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSolary=" + minSolary +
                ", maxSolary=" + maxSolary +
                '}';
    }
}
