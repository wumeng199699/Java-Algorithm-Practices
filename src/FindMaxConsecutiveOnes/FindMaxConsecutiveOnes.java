package FindMaxConsecutiveOnes;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
                if (res < count) res = count;
            }
            else count = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
