import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CreatorCar {

    public void createAll(List<? extends Car> list){ //producer - из него берем данные, добавлять в него строго запрещенн
        Car car = list.get(0); // нормально смотрим, положить не получиться
    }

    public void fillList(List<? super Car> list){//consumer
        List<Objects>
        list.add(new Car()); // плохо удается посмотреть, но можно положить обьекты
    }
}
