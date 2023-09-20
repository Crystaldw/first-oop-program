package car;

import java.util.Objects;

public abstract class Car {

    public int id;
    private final String model;
    private String color;
    private int currentSpeed;

    private int cost;

    private int fuel;

    private TransmisionType type;

    //механическая
    //автомат
    //искуственный интелект
    public final static int MAX_SPEED = 160;

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public Car() {
        id = 0;
        model = "";
    }

    public abstract void drift();

    public void getInfo() {
        System.out.println();
        System.out.println("Информация о машине");
        System.out.println("Идентификатор машины = " + id);
        System.out.println("Модель машины " + model);
        System.out.println("Цвет машины " + color);
        System.out.println();
    }

    public void go(int speed) {
        currentSpeed = speed;


        if (type == null) {
            return;
        }

        switch (type) {
            case MECHANIC:
                System.out.println("Немного заглохли, но поехали");
                break;
            case AUTO:
                System.out.println("Отлично поехали");
                break;
            case AI:
                System.out.println("Я даже отпустил руль");
                break;
        }
    }

    public TransmisionType getType() {
        return type;
    }

    public void setType(TransmisionType type) {
        this.type = type;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        else {
            System.out.println("Скорость не была изменена");
        }
    }

    public void startEngine() {
        check();
        if (currentSpeed == 0) {
            startAfterCheck();
        }
    }

    private void check() {
        System.out.println("Проверить топливо");
        System.out.println("Проверить электронику");
    }

    //сигнатура = название метода + все параметры

    private void startAfterCheck() {
        System.out.println("Зажигание");
        System.out.println("Запуск двигателя");
        System.out.println(">>>Двигатель запущен");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(type !=null){
            this.cost = (int) (cost* type.getCoeficientOfCost());
        }
        else {
            this.cost = cost;
        }
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

        if (id != car.id) return false;
        if (currentSpeed != car.currentSpeed) return false;
        if (cost != car.cost) return false;
        if (fuel != car.fuel) return false;
        if (!Objects.equals(model, car.model)) return false;
        if (!Objects.equals(color, car.color)) return false;
        return type == car.type;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + currentSpeed;
        result = 31 * result + cost;
        result = 31 * result + fuel;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", cost=" + cost +
                ", fuel=" + fuel +
                ", type=" + type +
                '}';
    }
}

