import java.util.Arrays;

/*
6. 3Sum Closest
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 +
 */
public class ThreeClosetSum {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    static public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = nums[0] + nums[1] + nums[2];
        int l, r;

        for (int i = 0; i < nums.length - 1; i++) {
            // remove duplicate
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            l = i + 1;
            r = nums.length - 1;

            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(closet - target))
                    closet = sum;

                if (sum > target) {
//                    if (sum - target < diff) {
//                        diff = sum - target;
//                        closet = sum;
//                    }
                    r--;
                } else {
//                    if (target - sum < diff) {
//                        diff = target - sum;
//                        closet = sum;
//                    }
                    l++;
                }

            }
        }
        return closet;

    }
}
