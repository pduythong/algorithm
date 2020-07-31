import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Checksum;

/*
39. Combination Sum
Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] can = new int[]{2,3,5};
        combinationSum(can,8).forEach(System.out::println);
    }

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(candidates);
//        combinationSum(candidates, target, 0, ans, new ArrayList<>());
        combinationSumNoSort(target, candidates, new ArrayList<>(), ans);
        return ans;

    }

    static void combinationSum(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> element) {

        if (target < 0) return;

        if (target == 0) ans.add(new ArrayList<>(element));

        for (int i = index; i < candidates.length; i++) {
            element.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i, ans, element);
            element.remove(element.size()-1);
        }

    }

   static private void combinationSumNoSort(int sum, int[] candidates, List<Integer> element, List<List<Integer>> result) {
        if (sum == 0) {
            result.add(new ArrayList<>(element));
            return;
        }
        for (int candidate : candidates) {
            if (candidate <= sum && (element.isEmpty() || candidate >= element.get(element.size() - 1))) {
                element.add(candidate);
                combinationSumNoSort(sum - candidate, candidates, element, result);
                element.remove(element.size() - 1);
            }
        }
    }
}
