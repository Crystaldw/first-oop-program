public class Queue {


    private int head = 0;
    private int top = 0;
    private int size = 0;
    private Integer[] array;
    private int capacity;


    public Queue(int capacity) {
        this.capacity = capacity;
        array = new Integer[capacity];
        head = 0;
        top = 0;
        size = 0;
    }

    public void push(Integer elm) {
        if ((top + 1) % capacity == head) {
            throw new RuntimeException("Queue is full");
        }
        array[top] = elm;
        top = (top + 1) % capacity;
    }

    public Integer pop(){
        if (size==0);
        return null;
    }

    Integer answer = array[head];
    array[head] = null;
    head = (head)

}
