/*
4. An encoded string S is given. To find and write the decoded string to a tape

input - ha22
output - hahahaha

input - leet2code3
output - leetleetcodeleetleetcodeleetleetcode

 */

public class DecodeString {


    public static String decode(String s) {

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {

            if (Character.isDigit(s.charAt(i))) {
                int count = s.charAt(i) - '0';
                String tmp = result.toString();

                for (int j = 0; j < count - 1; j++) {
                    result.append(tmp);
                }
                i++;

            } else {
                StringBuilder sb = new StringBuilder();
                while (i < s.length() && Character.isAlphabetic(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;

                }
                result.append(sb);
            }

        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(decode("leet2code3"));
        System.out.println(decode("ha22h"));
    }

}
