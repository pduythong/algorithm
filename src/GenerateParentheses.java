import java.util.ArrayList;
import java.util.List;

/*
22. Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class GenerateParentheses {

    static public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, n, n, new char[2 * n], 0);
        return ans;

    }

    static void generate(List<String> ans, int left, int right, char[] str, int index) {
        if (left < 0 || left > right) return;

        if (left == 0 && right == 0) {
            ans.add(String.valueOf(str));
        } else {
            str[index] = '(';
            generate(ans, left - 1, right, str, index + 1);

            str[index] = ')';
            generate(ans, left, right - 1, str, index + 1);

        }
    }
}
