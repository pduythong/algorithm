import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinationsPhoneNumber {

    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        helper(ans, digits, "");
        return ans;
    }

    void helper(List<String> ans, String digits, String combination) {
        if (digits.length() == 0) {
            ans.add(combination);
            return;
        }

        String digit = digits.substring(0, 1);
        String letters = phone.get(digit);

        for (char letter : letters.toCharArray()) {
            helper(ans, digits.substring(1), combination + letter);
        }

//        for (int i = 0; i < letters.length(); i++) {
//            char letter = letters.charAt(i);
//            helper(ans, digits.substring(1), combination + letter);
//        }

    }


}
