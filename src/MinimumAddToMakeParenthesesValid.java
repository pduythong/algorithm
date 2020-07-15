/*
921. Minimum Add to Make Parentheses Valid
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:

It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 */
public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((()()("));
        System.out.println(minAddToMakeValid("(()()("));
    }

    static public int minAddToMakeValid(String S) {
        int ans = 0;
        int bal = 0;

        for (char c : S.toCharArray()) {
            bal += c == '(' ? 1 : -1;
            if (bal == -1) {
                ans++;
                bal = 0;
            }

        }
        return bal + ans;
    }

}
