import java.util.Arrays;

public class MyArrayList {

    private int[] array;

    private int size;

    public MyArrayList() {
        array = new int[10];
    }

    public void add(int value) {
        if (size == array.length) {
            grow();
        }
        array[size] = value;
        size++;
    }

    private void grow() {
        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
    //contains():
    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }



    //size():
    //remove(index)
    //add(index, 5)
    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
