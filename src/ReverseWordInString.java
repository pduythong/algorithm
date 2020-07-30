public class ReverseWordInString {

    public static void main(String[] args) {
        System.out.println(reverse("a b c d e f"));
    }

    public static String reverse(String s) {
        StringBuilder ans = new StringBuilder();
        String[] tmp = s.split(" ");

        for (int i = 0; i < tmp.length; i++) {
            if (i == tmp.length - 1) {
                ans.insert(0, tmp[i]);

            } else {
                ans.insert(0, " " + tmp[i]);
            }
        }
        return ans.toString();
    }
}
