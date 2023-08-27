package person;

public class Worker extends Person {

    private Double minSolary; //минимальная зарплата
    private Double maxSolary; //максимальная зарплата

    public Worker(String name, int age, int height, double weight, double money, Double minSolary, Double maxSolary) {
        super(name, age, height, weight, money);
        this.minSolary = minSolary;
        this.maxSolary = maxSolary;
    }

    public Double getMinSolary() {
        return minSolary;
    }

    public void setMinSolary(Double minSolary) {
        this.minSolary = minSolary;
    }

    public Double getMaxSolary() {
        return maxSolary;
    }

    public void setMaxSolary(Double maxSolary) {
        this.maxSolary = maxSolary;
    }

    @Override
    public void die(){
        System.out.println("Этот человек не дожил до пенсии");
    }
}
