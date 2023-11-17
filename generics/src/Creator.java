import java.util.List;

public class Creator<T> {

    public void createAll(List<? extends T>list){
        System.out.println("Успешно создано");
    }
}
