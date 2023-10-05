package somewhere;

public class MaxNumberFinder {

    public static void main(String[] args) {

        int[] array = {2, 6, 4, 9, 7, 0, 8, 3, 1, 5};

        int maxNumber = findMaxNumber(array);

        System.out.println("Максимальное число в массиве: " +maxNumber);

    }

    public static int findMaxNumber(int[] array){
        if(array==null || array.length==0){
            throw  new IllegalArgumentException("Массив пуст. Это недопустимо.");
        }
        int max = array[0];
        for (int i = 1; i <array.length ; i++) {
          if(array[i]>max){
              max = array[i];
          }
        }
        return max;
    }
}
