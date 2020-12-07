import java.util.Arrays;

/*
Remove minimum elements from the array such that 2*min becomes more than max
Last Updated: 27-12-2019
Given an array of size N. The task is to remove minimum elements from the array such that twice of minimum number is greater than the maximum number in the modified array. Print the minimum number of elements removed.

Examples:

Input: arr[] = {4, 5, 100, 9, 10, 11, 12, 15, 200}
Output: 4
Remove 4 elements (4, 5, 100, 200)
so that 2*min becomes more than max.

Input: arr[] = {4, 7, 5, 6}
Output: 0
 */
public class TwiceMinimum {

    static int TwiceMinimum(int n, int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = n - 2;
        int idx = -404;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] * 2 > nums[n - 1]) {
                if (idx == -404) {
                    idx = mid;

                } else if (idx < mid) {
                    idx = mid;

                }
                right = mid - 1;

            }else{
                left = mid +1;
                if(idx != 404) return idx;

            }
        }

        return idx;

    }
}
