import java.util.ArrayList;
import java.util.List;

public class MainCreator {

    public static void main(String[] args) {

        List<Car>list = new ArrayList<>();
        Car volvo = new Car();
        Car bmw = new Car();
        Car audi = new Car();
        list.add(volvo);
        list.add(bmw);
        list.add(audi);

        List<Jeep> jeepList = new ArrayList<>();
        Jeep jeep = new Jeep();
        jeepList.add(jeep);

        Creator<Car> creator = new Creator<>();
        creator.createAll(list);
        creator.createAll(jeepList);

        // стирание типов
        List<Jeep> list1 = new ArrayList<>();
        CreatorCar creatorCar = new CreatorCar();
        creatorCar.createAll(list1);
        //creatorCar.fillList(list1);
    }
}
