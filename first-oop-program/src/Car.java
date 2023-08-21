public class Car {

    int id;
    String model;

    String color;

    int currentSpeed;

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public void drift() {
        System.out.println("Супер крутой дрифт...");
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
}
