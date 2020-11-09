import java.util.HashSet;
import java.util.Set;

/*
Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]


 */
public class Pangram {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(s));

    }

    public static boolean checkPangram(String s) {

        Set<Integer> mark = new HashSet<>();

        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                mark.add((int) c);
            }
        }
        return mark.size() == 26;
    }

    public static boolean checkPangramArr(String s) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (char c : s.toCharArray()) {

            if (c >= 'A' && c <= 'Z')
                index = c - 'A';
            else if (c >= 'a' && c <= 'z')
                index = c - 'a';
            else
                continue;
            mark[index] = true;
        }
        for (boolean b : mark)
            if (!b) return false;
            
        return true;
    }

}
