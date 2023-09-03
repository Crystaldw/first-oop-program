package car;

import java.util.Objects;

public class Car {

    private int id;
    private String model;
    private String color;
    private int currentSpeed;
    private int cost;

    public final static int MAX_SPEED = 60;

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

//   public Car(int id, String model){
//        this.id = id;
//        this.model = model;
//   }

    public void drift() {
        System.out.println("Super Drift");
    }

    public void getInfo() {
        System.out.println();
        System.out.println("Информация о машине");
        System.out.println("Идентификатор машины = " + id);
        System.out.println("Модель машины " + model);
        System.out.println("Цвет машины " + color);
        System.out.println();
    }

    public void go(int speed) {
        if (currentSpeed == 0) {
            System.out.println("Машина начала ехать со скоростью " + speed);
        } else {
            System.out.println("Машина начала ехать со скоростью " + speed);
        }
        currentSpeed = speed;

    }

    public void setColor(String color) { //запись, set - установить
        this.color = color;
    }

    public String getColor() { //чтение, get - получить
        return color;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed < 500) {
            this.currentSpeed = currentSpeed;
        }
    }

    public void startEngine() {
        check();
        startAfterCheck();
    }

    public void check() {
        System.out.println("Проверить топливо");
        System.out.println("Проверить электронику");
    }

    private void startAfterCheck() {
        System.out.println("Зажигание");
        System.out.println("Запуск двигателя");
        System.out.println(">>>Двигатель запущен");
    }

    public int getCoast() {
        return cost;
    }

    public void setCoast(int coast) {
        this.cost = coast;
    }

    public void changeCost(int sale) {//15 = 15%
        cost = cost - cost * sale / 100;
    }

    public void changeCost(double sale) {//0.15 = 15%
        double answer = cost - cost * sale;
        cost = (int) answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id
                && currentSpeed == car.currentSpeed
                && cost == car.cost
                && Objects.equals(model, car.model)
                && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, currentSpeed, cost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", coast=" + cost +
                '}';
    }
//     override - переопределение метода
//     overLoading
}

