package person;

public class Person {
    private String name;
    private int age;
    private int height;
    private double weight;
    private double money;

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

    public void die(){
        System.out.println("Человек погиб.");
    }
}