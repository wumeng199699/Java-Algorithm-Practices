package DuplicateZeros;

import java.util.Arrays;

// Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
public class DuplicateZeros {
    public static int[] duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr = duplicate(arr, i);
                i = i + 1;
            }
        }
        return arr;
    }

    public static int[] duplicate (int[] arr, int index){
        for (int i = arr.length - 2; i >= index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = 0;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(arr)));
    }
}
