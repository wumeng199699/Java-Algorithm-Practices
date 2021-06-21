package ValidMountainArray;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int index = 0;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            if (arr[i+1]<arr[i]){
                index = i;
                break;
            }
        }
        if (index == 0) return false;
        for (int k = 0; k < index; k++){
            if (arr[k+1] <= arr[k]) return false;
        }
        for (int j = index; j < length - 1; j++){
            if (arr[j+1]>=arr[j]) return false;
        }
        System.out.println(index);
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
