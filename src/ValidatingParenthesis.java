import java.util.Stack;

/*

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

 */
public class ValidatingParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("()[][]{})"));
        System.out.println(isValid("()[][]{}()"));
    }

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                char o = stack.pop();
                if(!isValid(o,c)) return false;
            } else
                return false;
        }
        return stack.isEmpty();
    }

    static boolean isValid(char o, char c) {
        return ((o == '(' && c == ')')
                || (o == '{' && c == '}')
                || (o == '[' && c == ']'));
    }


}




