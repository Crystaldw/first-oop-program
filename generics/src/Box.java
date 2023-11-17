public class Box<T extends Number, R extends String> {

    T value;

    R secondValue;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

