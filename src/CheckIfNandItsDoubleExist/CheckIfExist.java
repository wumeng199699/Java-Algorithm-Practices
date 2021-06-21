package CheckIfNandItsDoubleExist;

import java.util.HashSet;
import java.util.Set;

// Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if (set.contains(2*arr[i]) || (set.contains(arr[i]/2)) && arr[i] % 2 == 0) return true;
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}
