package FindNumbers;

// Given an array nums of integers, return how many of them contain an even number of digits.
public class FindNumbers {
    public static int findNumbers(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            String num = String.valueOf(nums[i]);
            if (num.length() % 2 == 0) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
