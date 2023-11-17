package leson_19_10_23;

public class TwoPointers {

    private static boolean hasPainrWithSum(int[] nums, int targetSum){
        int left = 0;
        int right = nums.length-1;

        while (left<right){
            int sum = nums[left]+nums[right];

            if(sum == targetSum)return  true;
            if (sum<targetSum)left++;
            else right --;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        int targetSum = 14;

        boolean hasPair = hasPainrWithSum(nums, targetSum);

        if(hasPair){
            System.out.println("В массиве есть пара чисел с суммой " + targetSum);
        }else {
            System.out.println("В массиве нет пары чисел с суммой " + targetSum);
        }
    }
}
