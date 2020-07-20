import java.util.ArrayList;
import java.util.List;

/*
763. Partition Labels

A string S of lowercase English letters is given.
 We want to partition this string into as many parts as possible so that each letter appears in at most one part,
 and return a list of integers representing the size of these parts.

Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;

        }

        List<Integer> ans = new ArrayList<>();
        int l = 0, r = 0;

        for (int i = 0; i < s.length(); i++) {
            r = Math.max(r, last[s.charAt(i) - 'a']);
            if (r == i) {
                ans.add(r - l + 1);
                l = r + 1;
            }

        }

        return ans;

    }
}
