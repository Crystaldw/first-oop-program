import java.util.Objects;

public abstract class Person {

    private String naame;

    private int age;

    private double weight;

    private int height;

    private double money;

    private Gender gender;

    private Person dad;

    public Person(String naame, int age, double weight, int height) {
        this.naame = naame;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String naame, Gender gender) {

    }

    public void printInfo() {
        System.out.println("Имя человека " + naame);
        System.out.println("Возраст человека +" + age);
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Отдхаю");
        } else {
            System.out.println("Вот блин... работа");
        }
    }

    public void die(){
        System.out.println("Человек умер");
    }

    public abstract void die(int years);

    public String getNaame() {
        return naame;
    }

    public void setNaame(String naame) {
        this.naame = naame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person getDad() {
        return dad;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(weight, person.weight) != 0) return false;
        if (height != person.height) return false;
        if (Double.compare(money, person.money) != 0) return false;
        if (!Objects.equals(naame, person.naame)) return false;
        if (gender != person.gender) return false;
        return Objects.equals(dad, person.dad);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = naame != null ? naame.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + height;
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dad != null ? dad.hashCode() : 0);
        return result;
    }
}
