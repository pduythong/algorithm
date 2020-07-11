import java.util.HashMap;

/*
Question: For a given string "abbbcddddeffabbbbbb"
return the characters who are consecutively repeated like "bbb"
and how many times it appears on the string.
For example, return a HashMap like,
b -> 2 Note: (bbb & bbbbbb)
d -> 1
f -> 1
 */
public class StringConsecutive {

    public static void main(String[] args) {
        System.out.println(solve("abbbcddddeffabbbbbb"));
    }

    public static HashMap<Character,Integer> solve(String s){
        HashMap<Character, Integer> ans = new HashMap<>();
        for(char c: s.toCharArray()){
            ans.put(c, ans.getOrDefault(c, 0) +1);
        }
        return ans;
    }

}
