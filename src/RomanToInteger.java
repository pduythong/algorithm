import java.util.HashMap;
import java.util.Map;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("LVIII"));
    }

    static public int romanToInt(String s) {
        if (s.isEmpty()) return 0;

        Map<Character, Integer> romanDict = new HashMap<>();
        romanDict.put('I', 1);
        romanDict.put('V', 5);
        romanDict.put('X', 10);
        romanDict.put('L', 50);
        romanDict.put('C', 100);
        romanDict.put('D', 500);
        romanDict.put('M', 1000);

        int ans = 0;

        // checking every character on the String s
        for (int i = 0; i < s.length(); i++) {
            // get the current integer value from the HM
            int val = romanDict.get(s.charAt(i));

            /* if the next value is >= the current value * 5
               then get next value - current value
               increment i + 1
            */
            if (i + 1 < s.length() && romanDict.get(s.charAt(i + 1)) >= val * 5) {
                ans += romanDict.get(s.charAt(i + 1)) - val;
                i++;
                // otherwise add normally
            } else {
                ans += val;
            }

        }
        return ans;
    }

}
