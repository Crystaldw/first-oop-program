import java.util.ArrayList;
import java.util.List;

public class Window {

    public static void findShortTestArray(List<Integer> arrayList, int targetSum) {
        int leftBorder = 0;
        int rightBorder = 0;
        int sum = 0;

        int minLength = Integer.MAX_VALUE;
        int answerLeftBorder = 0;
        int answerRightBorder = 0;


        while (rightBorder < arrayList.size()) {
            sum += arrayList.get(rightBorder);
            while (sum >= targetSum) {
                int windowLength = rightBorder - leftBorder + 1;
                if (windowLength < minLength && sum == targetSum) {
                    answerLeftBorder = leftBorder;
                    answerRightBorder = rightBorder;
                    minLength = windowLength;
                }
                sum -= arrayList.get(leftBorder);
                leftBorder++;
            }
            rightBorder++;
        }
        if (minLength != Integer.MAX_VALUE) {
            for (int i = answerLeftBorder; i <= answerRightBorder; i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }



    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1, 1, 1, 2, 4, 5);

        findShortTestArray(arrayList, 3);
    }
}

