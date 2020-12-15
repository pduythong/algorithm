public class PalindromeString {


    public static void main(String[] args) {
//        System.out.println(checkPalindrome("ABA"));
//        System.out.println(checkPalindrome("ABBCA"));
        System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
    }


    public static boolean checkPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        char[] arr = s.toCharArray();

        while (l < r) {
            char firstChar = arr[l];
            char lastChar = arr[r];
            if (!((firstChar >= 'a' && firstChar <= 'z') || (firstChar >= 'A' && firstChar <= 'Z') || (firstChar >= '0' && firstChar <= '9'))) {
                l++;
                continue;
            }

            if (lastChar >= 'a' && lastChar <= 'z' || lastChar >= 'A' && lastChar <= 'Z' || lastChar >= '0' && lastChar <= '9') {
                r--;
                continue;
            }

            if (Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)) return false;
            l++;
            r--;

        }
        return true;

//        for (int i = 0; i < s.length()/2; i++) {
//
//            if(s.charAt(i) != s.charAt(s.length()-1-i)){
//                return false;
//            }
//
//        }
//        return true;
    }
}
