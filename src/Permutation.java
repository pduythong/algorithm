import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3};
        int[] nums = new int[]{1,  2};
        permuteArray(nums).forEach(System.out::println);

    }

    public static List<List<Integer>> permuteArray(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, ans, 0);
        return ans;
    }

    public static void permute(int[] nums, List<List<Integer>> ans, int index) {

        if (index == nums.length - 1) {
            List<Integer> subSet = new ArrayList<>();
            for (int num : nums) {
                subSet.add(num);
            }
            ans.add(subSet);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // check duplicate
            // neu ko co duplicate thi remove ham shouldSwap.
            if(shouldSwap(nums, index, i)){
                swap(nums, i, index);
                permute(nums, ans, index + 1);
                swap(nums, i, index);
            }

        }

    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

    // check duplicate.
    private static boolean shouldSwap(int[] nums, int start, int current){
        for (int i = start; i < current; i++) {
            if(nums[i] == nums[current]){
                return false;
            }

        }
        return true;
    }

}
