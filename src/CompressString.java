import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
Given a string "aaabbbcc", compress it, = "a3b3c2" .
Given that output string's length is always smaller than input string, you have do it inplace.
No extra space like array should be used.
 */
public class CompressString {
    public static void main(String[] args) {
        String s = "aaabbbccddee";
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);

        //Arrays.sort(String[] arr, Collections.reverseOrder());

        System.out.println(compress(sb.toString()));
        System.out.println(compress(sb.reverse().toString()));

        Collections.reverse(Collections.singletonList(arr));
    }

    public static String compress(String s) {

        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s.charAt(0) + "2";
            } else {
                return s;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int count = i + 1;
            while (count < s.length() && s.charAt(i) == s.charAt(count)) {
                count++;
            }

            if (count - i != 1) {
                s = s.substring(0, i + 1) + (count - i) + s.substring(count);
                i++;
            }

        }
        return s;

    }
}
