package RemoveDuplicatesfromSortedArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates3 {
    public static int removeDuplicates(int[] nums) {
        int[] result = new int[nums.length];
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for (int num:nums){
            if (!set.contains(num)) {
                result[i++] = num;

            }
            set.add(num);
        }
        System.out.println(Arrays.toString(result));
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
