/*
844. Backspace String Compare
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */
public class BackspaceString {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "c#d#a"));
    }

    static public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int countS = 0;
        int countT = 0;

        while (i >= 0 && j >= 0) {
            while (i >= 0 && (countS > 0 || s.charAt(i) == '#')) {
                if (s.charAt(i) == '#') countS++;
                else countS--;
                i--;
            }
            char left = i < 0 ? '$' : s.charAt(i);

            while (j >= 0 && (countT > 0 || t.charAt(j) == '#')) {
                if (t.charAt(j) == '#') countT++;
                else countT--;
                j--;
            }
            char right = j < 0 ? '$' : t.charAt(j);

            if (left != right) return false;
            i--;
            j--;

        }
        return true;
    }
}
