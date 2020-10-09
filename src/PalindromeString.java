public class PalindromeString {


    public static void main(String[] args) {
        System.out.println(checkPalindrome("ABA"));
        System.out.println(checkPalindrome("ABBCA"));
    }


    public static boolean checkPalindrome(String s){

        for (int i = 0; i < s.length()/2; i++) {

            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }

        }
        return true;
    }
}
