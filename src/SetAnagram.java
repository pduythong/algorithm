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
            String newWord = new String(letters);

            if(ans.containsKey(newWord)){
                ans.get(newWord).add(s);
            }else{
                List<String> wordList = new ArrayList<>();
                wordList.add(s);
                ans.put(newWord, wordList);

            }
        }

        return ans;
    }

}
