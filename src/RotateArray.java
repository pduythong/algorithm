import java.util.Arrays;

/*
189. Rotate Array
Given an array, rotate the array to the right by k steps, where k is non-negative.
Follow up:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    static public void rotate(int[] nums, int k) {
        int n = nums.length;
        int prev = 0, step = 0, index = 0;
        int swap = nums[0];

        while (step < n) {
            index = (index + k) % n;
            int tmp = nums[index];
            nums[index] = swap;
            swap = tmp;

            if (index == prev) {
                index = ++prev;
                if (prev >= n) return;
                ;
                swap = nums[prev];
            }
            step++;
        }

    }
}
