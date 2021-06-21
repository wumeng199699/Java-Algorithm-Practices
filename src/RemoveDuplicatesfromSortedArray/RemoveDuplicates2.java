package RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        int readPoint = 1, writePoint = 1;
        for (; readPoint < nums.length; readPoint++){
            if (nums[readPoint] != nums[readPoint - 1]) {
                nums[writePoint] = nums[readPoint];
                writePoint++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return writePoint;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }
}
