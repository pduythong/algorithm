import java.util.*;

public class PairSumUpToThird {

    public static void main(String[] args) {
        twoSum(new int[]{1, 1, 2, 3, 5, 9, 7, 1, 1}, 5).forEach(System.out::println);
        twoSumHash(new int[]{1, 1, 2, 3, 5, 9, 7, 1, 1}, 5).forEach(System.out::println);
    }

    static public List<Integer> twoSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int l = 0, r = nums.length - 1;
        Arrays.sort(nums);

        while (l < r) {
            int sum = nums[l] + nums[r];

            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                ans.add(nums[l]);
                ans.add(nums[r]);
                l++;
                r--;

                // remove duplicate;
                while (l < r && nums[l] == nums[l - 1]) l++;
                while (l < r && nums[r] == nums[r + 1]) l++;
            }

        }
        return ans;
    }

    public static List<Integer> twoSumHash(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            int tmp = target - num;
            if (set.contains(tmp)) {
                ans.add(num);
                ans.add(tmp);
            }
            set.add(num);

        }

        return ans;

    }
}
