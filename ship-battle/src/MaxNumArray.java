public class MaxNumArray {

    public static int search(int[] array) {
        int leftBorder = 0;
        int rightBorder = array.length - 1;

        while (leftBorder <= rightBorder) {
            int middleIndex = (leftBorder + rightBorder) / 2;

            if ((middleIndex == 0 || array[middleIndex] > array[middleIndex - 1]) && (middleIndex == array.length - 1 || array[middleIndex] > array[middleIndex + 1]))
                return middleIndex;
            if (array[middleIndex] > array[middleIndex + 1]) {
                rightBorder = middleIndex - 1;
            } else {
                leftBorder = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 7, 6, 5};
        System.out.println(MaxNumArray.search(arr));
    }
}



