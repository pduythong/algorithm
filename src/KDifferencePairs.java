import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.

Example 1:
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:
Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Example 4:
Input: nums = [1,2,4,4,3,3,0,9,2,3], k = 3
Output: 2

Example 5:
Input: nums = [-1,-2,-3], k = 1
Output: 2
 */

public class KDifferencePairs {

    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5}, 2));
    }

    static public int findPairs(int[] nums, int k) {
        HashMap<Integer,Boolean> seen = new HashMap<Integer,Boolean>();
        int pairs = 0;
        for (int num : nums) {
            if (!seen.containsKey(num)) {
                if (seen.containsKey(num + k)) {
                    pairs++;
                }
                if (seen.containsKey(num - k)) {
                    pairs++;
                }

                seen.put(num, false);
            } else if (k == 0) {
                if (seen.get(num) == false) {
                    pairs++;
                    seen.put(num, true);
                }
            }
        }
        return pairs;

    }

    // Function to find pair with given difference in the array
    // This method do not handle duplicates in the array
    public static void findPair(int[] A, int diff)
    {
        // array is unsorted

        // take an empty set
        Set<Integer> set = new HashSet<>();

        // do for each element in the array
        for (int i: A)
        {
            // check if pair with given difference (i, i-diff) exists
            if (set.contains(i - diff)) {
                System.out.println("(" + i + ", " + (i - diff) + ")");
            }

            // check if pair with given difference (i+diff, i) exists
            if (set.contains(i + diff)) {
                System.out.println("(" + (i + diff) + ", " + i + ")");
            }

            // insert element into the set
            set.add(i);
        }
    }

}
