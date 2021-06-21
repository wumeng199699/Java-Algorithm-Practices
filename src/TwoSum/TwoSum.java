package TwoSum;

import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] index = new int[2];
        for (int i = 0; i < list.length; i++){
            if (map.containsKey(sum - list[i])){
                index[0] = map.get(sum - list[i]);
                index[1] = i;
            }
            map.put(list[i], i);
        }
        if (index[0] == index[1]) return null;
        return index;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
