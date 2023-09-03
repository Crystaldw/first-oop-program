package person;

public class Pensioner extends Person{

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
    public void die(){
        double x = (getAge()-50)*pension;
        System.out.println("Этот пенсионер умер, он зарабоотал: " + x);
    }
}
