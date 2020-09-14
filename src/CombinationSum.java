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

    static public List<List<Integer>> combinationSum(int[] nums, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        combinationSum(nums, sum, 0, ans, new ArrayList<>());
        combinationSumNoSort(sum, nums, new ArrayList<>(), ans);
        return ans;

    }

    static void combinationSum(int[] nums, int sum, int index, List<List<Integer>> ans, List<Integer> element) {

        if (sum < 0) return;

        if (sum == 0) ans.add(new ArrayList<>(element));

        for (int i = index; i < nums.length; i++) {
            element.add(nums[i]);
            combinationSum(nums, sum - nums[i], i, ans, element);
            element.remove(element.size()-1);
        }

    }

   static private void combinationSumNoSort(int sum, int[] nums, List<Integer> element, List<List<Integer>> result) {
        if (sum == 0) {
            result.add(new ArrayList<>(element));
            return;
        }
        for (int num : nums) {
            if (num <= sum && (element.isEmpty() || num >= element.get(element.size() - 1))) {
                element.add(num);
                combinationSumNoSort(sum - num, nums, element, result);
                element.remove(element.size() - 1);
            }
        }
    }
}
