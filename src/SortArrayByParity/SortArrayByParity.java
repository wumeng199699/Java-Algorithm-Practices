package SortArrayByParity;

import java.util.Arrays;

// Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            while (nums[right] % 2 != 0 && left < right) right--;
            while (nums[left] % 2 == 0 && left < right) left++;
            if (left < right){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
