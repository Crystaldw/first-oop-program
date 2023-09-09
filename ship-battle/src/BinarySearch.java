public class BinarySearch {

    public static int search(int[] arr, int elm) {
        int leftBorder = 0;
        int rightBorder = arr.length - 1;

        while (leftBorder <= rightBorder) {
            int midleIndex = (leftBorder + rightBorder) / 2;

            if (elm == arr[midleIndex]) return midleIndex;
            if (arr[midleIndex] < elm) {
                leftBorder = midleIndex + 1;
            } else {
                rightBorder = midleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int elm = 7;

        System.out.println(BinarySearch.search(arr,elm));
    }
}
