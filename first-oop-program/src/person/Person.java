package person;

import java.util.Objects;

public abstract class Person {
    private String name;
    private Gender gender;
    private int age;
    private int height;
    private double weight;
    private double money;

    public Person(String name, Gender gender, int age, int height, double weight, double money) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public Person(String name, int age, int height, double weight, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "; Age: " + age + "; Height: " + height);
    }

    public void goWork() {
        if (age < 18 || age >= 70) {
            System.out.println("Отдыхаю дома!");
        } else {
            System.out.println("Работаю!");
        }
    }


    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


//    public abstract double calculatePension();

    public void die(){
        System.out.println("Человек погиб.");
    }
    public abstract void die(int years);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (Double.compare(weight, person.weight) != 0) return false;
        if (Double.compare(money, person.money) != 0) return false;
        if (!Objects.equals(name, person.name)) return false;
        return gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + height;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                '}';
    }
}