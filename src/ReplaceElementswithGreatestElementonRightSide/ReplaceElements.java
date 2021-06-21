package ReplaceElementswithGreatestElementonRightSide;

import java.util.Arrays;

// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int l = arr.length - 1;
        for (int i = 0; i < l; i++){
            arr[i] = findMax(arr, i + 1);
        }
        arr[l] = -1;
        return arr;
    }
    public static int findMax(int[] arr, int index){
        int max = 0;
        for (int i = index; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
