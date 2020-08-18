import java.util.Arrays;

/*
 Question: For a given array return an array containing the even numbers first then the odd numbers. It should be done in-place, no other data structure is needed.
[3,2,1,4] ==> [2,4,3,1]
 */
public class EvenAndOddNumbers {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solve(new int[]{1, 2, 5, 6, 8, 9, 17, 23, 15, 10})));
//        System.out.println(Arrays.toString(solve(new int[]{3, 2, 1, 4})));
        System.out.println(Arrays.toString(solve(new int[]{1, 3})));
    }

    static public int[] solve(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            if (nums[l] % 2 > nums[r] % 2) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;

            }
            if (nums[l] % 2 == 0) l++;
            if (nums[r] % 2 >  0) r--;

        }

        return nums;
    }

}
