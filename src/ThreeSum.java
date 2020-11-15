import java.lang.reflect.Array;
import java.util.*;

/*
15. 3Sum
Medium

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 */
public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}, 0));
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        Set<List<Integer>> list = new HashSet<>();

        if (nums.length > 2) {
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                int l = i + 1;
                int r = nums.length - 1;
                int sum;

                while (l < r) {
                    sum = nums[i] + nums[l] + nums[r];
                    ;if(sum == target){
                        list.add(Arrays.asList(nums[i],nums[l],nums[r]));

                    }
                    if(sum < 0)
                        l++;
                    else
                        r--;

                }
            }
        }
        return new ArrayList<>(list);
    }

}
