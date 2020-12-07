public class CountPalindromeSubString {
    public static void main(String[] args) {
        System.out.println(countPalindromes("daata"));
        System.out.println(countPalindromes("abccba"));
    }


    public static int countPalindromes(String s) {

        if (s.length() == 1) return 1;

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += findPalindrome(s, i, i, n);
            count += findPalindrome(s, i, i + 1, n);
        }

        return count;
    }


    static int findPalindrome(String s, int left, int right, int n) {
        int count = 0;
        while (left >= 0 && right <= n - 1) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right += 1;
                count++;

            } else
                break;
        }
        return count;
    }
}



