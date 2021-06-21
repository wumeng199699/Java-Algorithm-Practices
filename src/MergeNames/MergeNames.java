package MergeNames;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        List<String> list = new ArrayList();
        HashSet<String> set = new HashSet<>();
        for (String str:names1){
            if (!set.contains(str)){
                list.add(str);
            }
            set.add(str);
        }
        for (String str:names2){
            if (!set.contains(str)){
                list.add(str);
            }
            set.add(str);
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
