package CombinationOfTelephoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations2 {
    public static List<String> letterCombinations(String digits) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        backTrack(res, map, digits, 0, new StringBuffer());
        return res;
    }

    public static void backTrack(List<String> res, Map<String, String> map, String digits, int index, StringBuffer stringBuffer){
        if (index == digits.length()) res.add(stringBuffer.toString());
        else {
            String letters = map.get(String.valueOf(digits.charAt(index)));
            for (int i = 0; i < letters.length(); i++){
                stringBuffer.append(letters.charAt(i));
                backTrack(res, map, digits, index+1, stringBuffer);
                stringBuffer.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
