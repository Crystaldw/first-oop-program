package car;

public class Cabriollet extends Car {
public boolean isOpend;

    public Cabriollet(int id, String model, String color, int currentSpeed, boolean isOpend) {
        super(id, model, color, currentSpeed);
        this.isOpend = isOpend;
    }
    //super - к родителю (car.Car)
    //this - этот объект (я)

    @Override
    public void  drift(){
        System.out.println("КАБРИОЛЕТ не для дрифта!");
    }
    }
