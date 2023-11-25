import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class  Worker extends Person implements AbleToCalculatePension {

    private final static double PENSION_COEFFICIENT = 0.25;
    private final static double ADDITIONAL_COEFFICIENT = 0.25;
    private final static int COUNT_OF_PROFS = 3;
    private int minSalary;
    private int maxSalary;
    private final static int MIN_AGE = 18;
    private final static int MAX_AGE = 65;
    private Set<Profession> professions;

    public Worker (String string){
        Random random = new Random();
        String[] array = string.split(" ");
        this.setName(array[0] + " " + array[1]);
        this.setAge(random.nextInt(MIN_AGE, MAX_AGE));
        this.minSalary = Integer.parseInt(array[2]);
        this.maxSalary = Integer.parseInt(array[3]);
        this.setGender((array[4].equals("MALE")) ? Gender.MALE : Gender.FEMALE);
    }

    public Worker(String name, int age, double weight, int height, int minSalary, int maxSalary, Set<Profession> professions) {
        super(name, age, weight, height);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.professions = professions;
    }

    public Worker(int minSalary, int maxSalary, Set<Profession> professions) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.professions = professions;
    }

    public Worker(String name, Gender gender, int minSalary, int maxSalary, Set<Profession> professions) {
        super(name, gender);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.professions = professions;
    }




    public Worker(String name, int age, double weight, int height) {
        super(name, age, weight, height);
    }

    public Worker(String name, double weight, int height) {
        super(name, 0, weight, height);
    }

    public Worker() {
        super(null, 0, 0, 0);
    }

    public static int getMinAgeOfWorker() {
        return MIN_AGE;
    }

    public static int getMaxAgeOfWorker() {
        return MAX_AGE;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Set<Profession> getProfessions() {
        return professions;
    }

    public void setProfessions(Set<Profession> professions) {
        this.professions = professions;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + "лет");
    }

    @Override
    public double calculatePension() {
        Gender gender = getGender();

        if (gender == null) {
            return 0.0;
        }

        double averageSalary;

        if (gender.equals(Gender.MALE)) {
            averageSalary = CalculatorUtils.calculateAverage(maxSalary, maxSalary);
        } else {
            averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2);
        }

        double additionalMoney = 0.0;

        if (professions != null) {
            int countProfessions = professions.size();
            additionalMoney = countProfessions / COUNT_OF_PROFS * ADDITIONAL_COEFFICIENT;
        }
        return averageSalary * PENSION_COEFFICIENT * (1 + additionalMoney);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return minSalary == worker.minSalary && maxSalary == worker.maxSalary && Objects.equals(professions, worker.professions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary, professions);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + getName()+
                ", age=" + getAge()+
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", gender=" + getGender() +
                '}';
    }
}
