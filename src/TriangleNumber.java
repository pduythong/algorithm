import java.util.Arrays;

/*
Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles
if we take them as side lengths of a triangle.
Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are:
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Note:
The length of the given array won't exceed 1000.
The integers in the given array are in the range of [0, 1000].

The condition for the triplets (a, b, c)(a,b,c) representing the lengths of the sides of a triangle, to form a valid triangle,
is that the sum of any two sides should always be greater than the third side alone. i.e. a + b > c, a+b>c, b + c > a b+c>a, a + c > b a+c>b.
 */
public class TriangleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 4};
        System.out.println(triangleNumber(nums));

    }

    static public int triangleNumberBrute(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i])
                        count++;
                }
            }
        }
        return count;

    }

    static public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                while (k < nums.length && nums[i] + nums[j] > nums[k])
                    k++;
                count += k - j - 1;
            }
        }
        return count;
    }
}
