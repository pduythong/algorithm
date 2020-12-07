import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NestedAnagram {

    public static void main(String[] args) {
        String s = "god earth space star lunar";
        String t = "paces dog rats heart ulnar";

        System.out.println(nestedAnagram(s, t));
    }

    static boolean nestedAnagram(String s, String t) {

        Map<String, Integer> map = new HashMap<>();
        s = s.trim();
        t = t.trim();

        for (String word : s.split(" ")) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String word : t.split(" ")) {
            char[] arr = word.trim().toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if (!map.containsKey(key)) return false;

            int val = map.get(key);

            if (val - 1 == 0) {
                map.remove(key);
            } else {
                map.put(key, val - 1);
            }
        }
        return map.size() == 0;
    }

}
