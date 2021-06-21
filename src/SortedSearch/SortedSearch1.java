package SortedSearch;

public class SortedSearch1 {
    public static int countNumbers(int[] sortedArray, int lessThan) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int low = 0;
        int high = sortedArray.length - 1;
        int middle = 0;
        while (low <= high){
            middle = (low + high) / 2;
            if (sortedArray[middle] >= lessThan){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch1.countNumbers(new int[] { 1, 3, 5, 7}, 4));
    }
}
