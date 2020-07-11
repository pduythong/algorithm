import java.util.Stack;

/*
678. Valid Parenthesis String
Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
 */
public class ValidParenthesisString {


    public static void main(String[] args) {
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("(*)"));
        System.out.println(checkValidString("(*))"));
        System.out.println(checkValidString("(*)*))("));
    }

    static public boolean checkValidString(String s) {

        Stack<Integer> stLeft = new Stack<>();
        Stack<Integer> stStar = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stLeft.push(i);
            } else if (c == '*') {
                stStar.push(i);
            } else {
                if (stLeft.isEmpty() && stStar.isEmpty()) return false;

                if (!stLeft.isEmpty()) {
                    stLeft.pop();
                } else {
                    stStar.pop();
                }
            }


        }
        // Check the valid sequence of parenthesis.
        while (!stLeft.empty() && !stStar.isEmpty()) {
            if (stLeft.pop() > stStar.pop()) return false;
        }

        return stLeft.isEmpty();

    }

}
