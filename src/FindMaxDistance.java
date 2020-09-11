/*
 * Find the maximum difference between the values in an array such that the largest values always comes after the
 * smallest value
 * Input: {2, 3, 10, 6, 4, 8, 1}
 * Output: 8
 *  Step 1) Set min value as arr[0] -> a
 *  Step 2) set max difference as arr[1] - arr[0]; -> b
 *  Step 3) Iterate and check if the value is > minValue.
 *  Step 4) If it is greater, then get the difference between the two values & check if the difference > max difference (b). If the difference is > set this diff as max difference
 *  Step 5) If it is less than minValue, set this value as minValue
 * */
public class FindMaxDistance {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(findDistance(nums));
    }

    public static int findDistance(int[] nums) {
        int minValue = nums[0];
        int maxDiff = nums[1] - nums[0];

        for (int num : nums) {

            if (num < minValue) {
                minValue = num;
            } else {

                int diff = num - minValue;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }

        }

        return maxDiff;
    }

}
