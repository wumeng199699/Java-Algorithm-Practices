package RemoveElement;

import java.util.Arrays;

// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//
//Return k after placing the final result in the first k slots of nums
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val) {
                if (num >= nums.length) break;
                nums = delete(nums, i);
                i = i - 1;
                System.out.println(Arrays.toString(nums));
            }
            else count++;
            num++;
        }
        return count;
    }

    public static int[] delete (int[] arr, int index){
        int val = arr[index];
        for (int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = val;
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {4,5};
        System.out.println(removeElement(nums, 4));
    }
}
