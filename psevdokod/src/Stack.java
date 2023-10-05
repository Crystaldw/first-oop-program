public class Stack {


    private int top;
    private Integer[] array;
    private int size;
    private int capacity;

    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        int top = 0;
        this.capacity = DEFAULT_CAPACITY;
        array = new Integer[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(int elm) {
        if (size >= capacity) {
            increaseCapacity();
        }
        array[top++] = elm;
        size++;
    }

    public Integer pop() {
        if (size == 0) {
            return null;
        }
        Integer answer = array[--top];
        array[top] = null;
        size--;
        return answer;
    }

    private void increaseCapacity() {
        capacity*=2;



    }

}
