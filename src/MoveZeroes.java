import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    static public void moveZeroes(int[] nums) {
        int l = 0, r = 1;

        while (r < nums.length) {
            if (nums[l] == 0 && nums[r] != 0) {
                nums[l] = nums[r];
                nums[r] =0;
                l++;
                r++;
            } else if (nums[l] == 0 && nums[r] == 0) {
                r++;
            } else {
                l++;
                r++;
            }
        }

    }
}
