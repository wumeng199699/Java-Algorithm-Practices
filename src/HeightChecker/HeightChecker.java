package HeightChecker;

// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
public class HeightChecker {
    public static int heightChecker(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        quickSort(expected, 0, expected.length - 1);
        int count = 0;
        for (int i = 0; i < expected.length; i++){
            if (heights[i] != expected[i]) count++;
        }
        return count;
    }
    public static void quickSort (int[] heights, int left, int right){
        if (left > right) return;
        int i = left;
        int j = right;
        int key = heights[left];
        while (i < j){
            while (heights[j] >= key && i < j) j--;
            while (heights[i] <= key && i < j) i++;
            if (i < j){
                int temp = heights[j];
                heights[j] = heights[i];
                heights[i] = temp;
            }
        }
        heights[left] = heights[i];
        heights[i] = key;
        quickSort(heights, left, j - 1);
        quickSort(heights, j + 1, right);
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
