package MoveZeroes;

import java.util.Arrays;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int readPoint = 0, writePoint = 0;
        for (; readPoint < nums.length; readPoint++){
            if (nums[readPoint] != 0) {
                nums[writePoint] = nums[readPoint];
                writePoint++;
            }
        }
        for (int i = writePoint; i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
