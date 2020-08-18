import java.util.*;

public class SetAnagram {
    public static void main(String[] args) {
        String[] arr = new String[] {"cat", "dog", "tac", "god", "act"};
        System.out.println(printSetAnagram(arr));
    }

    public static Map<String, List<String>> printSetAnagram(String[] arr) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : arr) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(ans.containsKey(key)){
                ans.get(key).add(s);
            }else{
                List<String> wordList = new ArrayList<>();
                wordList.add(s);
                ans.put(key, wordList);

            }
        }

        return ans;
    }

}
