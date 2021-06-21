package FindAllNumbersDisappearedinanArray;

import java.util.*;

public class FindAllNumbersDisappearedinanArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num:nums) set.add(num);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) result.add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
