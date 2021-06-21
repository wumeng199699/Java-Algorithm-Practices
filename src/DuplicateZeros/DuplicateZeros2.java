package DuplicateZeros;

import java.util.Arrays;

public class DuplicateZeros2 {
    public static int[] duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if (temp >= arr.length) break;
            newArr[temp] = arr[i];
            if (arr[i] == 0){
                temp++;
            }
            temp++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(arr)));
    }
}
