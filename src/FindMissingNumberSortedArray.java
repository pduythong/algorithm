public class FindMissingNumberSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 5, 6, 7};
        System.out.println(search(nums));

    }

    public static int search(int[] nums) {
        int l = 0, mid = 0, r = nums.length-1;

        while (r - l > 1) {
            mid = (l + r) / 2;

            if (nums[l] - l != nums[mid] - mid) {
                r = mid;
            } else if (nums[r] - r != nums[mid] - mid) {
                l = mid;
            }
        }

        return nums[mid] + 1;

    }

}
