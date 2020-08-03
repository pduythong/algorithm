/*
415. Add Strings
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddString {

    public static void main(String[] args) {
        System.out.println(addStrings("99", "9"));
    }


    static public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1;
        int cary = 0;

        while (i >= 0 || j >= 0 || cary == 1) {
            int x = i < 0 ? 0 : num1.charAt(i--) - '0';
            int y = j < 0 ? 0 : num2.charAt(j--) - '0';
            int sum = x + y + cary;
            cary = sum > 9 ? 1 : 0;

            sb.insert(0, sum % 10);

        }
        int a =0;
        return sb.toString();
    }
}
