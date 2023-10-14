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

    public void add(int index, int value) {
        if (index < 0 && index >= size) {
            return;
        }

        if (size == array.length) {
            grow();
        }

        int lastIndex = size - 1;

        for (int i = lastIndex; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 && index >= size) {
            return;
        }

        System.out.println("Start");

        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
            System.out.println(toString());
        }

        array[size - 1] = 0;
        size--;

        System.out.println("Finish");
    }


    private void grow() {
        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return size;
    }


    //size();
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