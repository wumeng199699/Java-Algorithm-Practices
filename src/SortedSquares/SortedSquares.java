package SortedSquares;

import java.util.Arrays;

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            newNums[i] = nums[i]*nums[i];
        }
        int left = 0;
        int right = nums.length - 1;
        quickSort(newNums, left, right);
        return newNums;
    }

    public static void quickSort(int[] nums, int left, int right){
        if (left > right) return;
        int key = nums[left];
        int i = left;
        int j = right;
        while (i < j){
            while (key <= nums[j] && i < j) j--;
            while (key >= nums[i] && i < j) i++;
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
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
