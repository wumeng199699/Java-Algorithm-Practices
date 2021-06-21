package CombinationOfTelephoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations1 {
    public static List<String> letterCombinations(String digits) {
        Map<String, String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        List<String> res = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++){
            List<String> temp = new ArrayList<>();
            String s = map.get(String.valueOf(digits.charAt(i)));
            for (int j = 0; j < s.length(); j++){
                if (res.size() == 0) {
                    temp.add(String.valueOf(s.charAt(j)));
                }
                for (int k = 0; k < res.size(); k ++){
                    temp.add(res.get(k)+""+s.charAt(j));
                }
            }
            res = temp;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
