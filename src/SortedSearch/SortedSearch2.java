// error
package SortedSearch;

import java.util.Arrays;

public class SortedSearch2 {
    public static int countNumbers(int[] sortedArray, int lessThan) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int i = Arrays.binarySearch(sortedArray, lessThan);
        int index = i < 0? -i:i;
        index = index >= sortedArray.length? index - 1:index;
        index = sortedArray[index] == lessThan? index:index - 1;
        return index;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch2.countNumbers(new int[] {1,3,5,7}, 4));
    }
}
