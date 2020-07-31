import java.util.ArrayList;
import java.util.List;

public class Permutation {


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        permute(nums).forEach(System.out::println);

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, 0);
        ;
        return ans;
    }

    public static void helper(int[] nums, List<List<Integer>> ans, int index) {

        if (index == nums.length - 1) {
            List<Integer> subSet = new ArrayList<>();
            for (int num : nums) {
                subSet.add(num);
            }
            ans.add(subSet);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            helper(nums, ans, index + 1);
            swap(nums, i, index);
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

}
