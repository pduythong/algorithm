import java.util.HashMap;

public class UniqueCharacter {

    public static void main(String[] args) {
        System.out.println(findUnique("abddac"));
    }

    public static String findUnique(String s) {
        HashMap<Character, Integer> uniChars = new HashMap<>();

        for (char c : s.toCharArray()) {
            uniChars.put(c, uniChars.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (uniChars.get(c) == 1)
                sb.append(c);

        }

        return sb.toString();
    }

}
