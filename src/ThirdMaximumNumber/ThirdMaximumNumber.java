package ThirdMaximumNumber;

import java.util.Arrays;

// Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.
public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int num = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        if (num < 3) return nums[0];
        return nums[2];
    }

    public static int removeDuplicates (int[] nums){
        int readPoint = 1, writePoint = 1;
        for (; readPoint < nums.length; readPoint++){
            if (nums[readPoint] != nums[readPoint - 1]) {
                nums[writePoint] = nums[readPoint];
                writePoint++;
            }
        }
        System.out.println(writePoint);
        return writePoint;
    }

    public static void quickSort (int[] nums, int left, int right){
        if (left > right) return;
        int i = left;
        int j = right;
        int key = nums[left];
        while (i < j){
            while (nums[j] <= key && i < j) j--;
            while (nums[i] >= key && i < j) i++;
            if (i < j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        nums[left] = nums[i];
        nums[i] = key;
        quickSort(nums, left, j - 1);
        quickSort(nums, j + 1, right);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(thirdMax(nums));
    }
}
