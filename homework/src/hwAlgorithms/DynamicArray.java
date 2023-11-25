package hwAlgorithms;

/*
Создайте структуру DynamicArray
Реализуйте два пути создания:
DynamicArray() - по умолчанию capacity = 1
DynamicArray(capacity) - изначальный массив имеет capacity = capacity

Реализуйте методы:
add(data) - добавляет в конец
remove() - удаляет последний
removeAt(index) - удаляет по индексу
growSize() - увеличивает размер
set(index, data) - изменяет элемент
clean() - удаляет все элементы
contains(data) - проверяет существует ли элемент
isEmpty() - вернет false, если в структуре есть элемент
 */

import java.util.Arrays;

public class DynamicArray {
    private Integer[] array;
    private int length;
    private int capacity;

    public DynamicArray() {
        this.length = 0;
        this.capacity = 1;
        this.array = new Integer[1];
    }

    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.length = 0;
        this.capacity = capacity;
        this.array = new Integer[capacity];
    }

    public void add(Integer elm) {
        if (this.length == this.capacity) {
            growSize();
        }
        this.array[length++] = elm;
    }

    public void remove() {
        if (this.length > 0) {
            this.length--;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        System.arraycopy(this.array, index + 1, this.array, index, this.length - index - 1);
        this.length--;
    }

    public void growSize() {
        this.capacity *= 2;
        this.array = Arrays.copyOf(this.array, this.capacity);
    }

    public void set(int index, Integer data) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        this.array[index] = data;
    }

    public void clean() {
        this.length = 0;
        this.array = new Integer[this.capacity];
    }

    public boolean contains(Integer data) {
        for (int i = 0; i < this.length; i++) {
            if (this.array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        System.out.println("Original array:");
        dynamicArray.print();

        System.out.println("\nRemoving the last element:");
        dynamicArray.remove();
        dynamicArray.print();

        System.out.println("\nRemoving element at index 1:");
        dynamicArray.removeAt(1);
        dynamicArray.print();

        System.out.println("\nSetting element at index 0 to 10:");
        dynamicArray.set(0, 10);
        dynamicArray.print();

        System.out.println("\nIs the array empty? " + dynamicArray.isEmpty());

        System.out.println("\nCleaning the array:");
        dynamicArray.clean();
        dynamicArray.print();

        System.out.println("\nIs the array empty after cleaning? " + dynamicArray.isEmpty());
    }

    private void print() {
    }
}

