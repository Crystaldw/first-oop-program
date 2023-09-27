import java.util.Arrays;
/*
    add elm = 1 , increase = length
    0. arr = [] , length = 0, capacity = 1, money = 0
    1. arr = [1], length = 1, capacity = 1, money = 2   , -1 + 3
    2. arr = [1, 2], length = 2, capacity = 2, money = 3 , -2 +3
    3. arr = [1, 2, 3], length = 3, capacity = 4, money = 3, -3 +3
    4. arr = [1, 2, 3, 4], length = 4, capacity = 4, money = 5, -1 +3
    5. arr = [1, 2, 3, 4, 5], length = 5, capacity = 8, money = 3  , -5 + 3
    6. arr = [1, 2, 3, 4, 5, 6], length = 6, capacity = 8, money = 5  , -1 + 3
    7. arr = [1, 2, 3, 4, 5, 6, 7], length = 7, capacity = 8, money = 7  , -1 + 3
    7. arr = [1, 2, 3, 4, 5, 6, 7, 8], length = 8, capacity = 8, money = 9  , -1 + 3
    8. arr = [1, 2, 3, 4, 5, 6, 7, 8, 9], length = 9, capacity = 16, money = 3  , -9 + 3
        ...
     */
public class DynamicArray {
    private Integer[] array;
    private int length;
    private int capacity;

    public DynamicArray(){
        this.length = 0;
        this.capacity = 1;
        this.array = new Integer[1];
    }

    public void add(Integer elm) {
        if(this.length == this.capacity) {
            this.capacity *= 2;
            this.array = Arrays.copyOf(this.array, this.capacity);
        }
        this.array[length++] = elm;
    }

    public Integer get(int index){
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return this.array[index];
    }

    public void print(){
        for(Integer i : this.array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        try {
            dynamicArray.print();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Problem");
        }
    }
}