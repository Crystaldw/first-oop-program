package person;

public class Person {
// 1 уровень сложности: 1)Создать класс Person.
//2) В нем добавить такие поля:
//    а) Имя человека (выбрать самостоятельно тип данных)
//    б) Возраст человека (выбрать самостоятельно тип данных)
//    в) Рост (выбрать самостоятельно тип данных)
//    г) Вес (выбрать самостоятельно тип данных)
//3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому
//4) Добавить методы:
//    a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
//    б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"
//            5) Создать несколько объектов и заполнить их
//    Доп. задание:
//            6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.
//            7) перед int money переменной поставить ключевое слово private. Описать, что произойдет в программе.

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