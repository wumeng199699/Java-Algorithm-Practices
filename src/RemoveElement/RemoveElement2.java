package RemoveElement;

public class RemoveElement2 {
    public static int removeElement(int[] nums, int val) {
        int readPoint = 0, writePoint = 0;
        for (; readPoint < nums.length; readPoint++){
            if (nums[readPoint] != val) {
                nums[writePoint] = nums[readPoint];
                writePoint++;
            }
        }
        return writePoint;
    }
    public static void main(String[] args) {
        int[] nums = {4,5};
        System.out.println(removeElement(nums, 4));
    }
}
