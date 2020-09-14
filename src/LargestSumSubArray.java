public class LargestSumSubArray {
    /*
     * Given an array, find the contiguous subarray with the largest sum.
     * Input: -4, 2,-5,1,2,3,6,-5,1
     * Output: the largest sum subarray starts at index 3 and ends at 6 and the largest sum is 12
     *
     *
     * Below solution has:
     * Runtime Complexity - Linear, O(n).
     * Memory Complexity - Constant, O(1).
     *
     * This can be solved by Kadane's algorithm:
     * Basic idea of Kadane's algorithm is scanning the entire array and at each position finding the maximum sum of
     * subarray ending there.
     * This is achieved by keeping a current maximum for the current array index and a global maximum.
     * */


    public static void main(String[] args) {
        System.out.println(getLargestSumSubArray(new int[]{-4, 2,-5,1,2,3,6,-5,1}));
    }

    public static int getLargestSumSubArray(int[] nums) {
        int maxSoFar = 0;
        int maxAtEnd = 0;

        for (int num : nums) {
            maxSoFar = Math.max(0, num + maxSoFar);
            maxAtEnd = Math.max(maxAtEnd, maxSoFar);
        }

        return maxAtEnd;

    }


}
