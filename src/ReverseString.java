public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reversString("aaaabbbbb"));
    }

    static public String reversString(String s) {
        char[] letters = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            char tmp = letters[i];
            letters[i] = letters[s.length() - 1 - i];
            letters[s.length() - 1 - i] = tmp;
        }

        return new String(letters);
    }
}
