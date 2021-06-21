package RemoveDuplicatesfromSortedArray;

import java.util.HashSet;
import java.util.Set;

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            if (num >= nums.length) break;
            if (set.contains(nums[i])){
                nums = remove(nums, i);
                i = i - 1;
            }
            else count++;
            set.add(nums[i]);
            num++;
        }
        return count;
    }
    public static int[] remove (int[] nums, int index){
        int val = nums[index];
        for (int i = index; i < nums.length - 1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = val;
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
