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
        int i = 0, j = nums.length - 1;

        while (i < j) {

            if (nums[i] % 2 > nums[j] % 2) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;

            }
            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 >  0) j--;


//            if (nums[i] % 2 == 0) {
//                i++;
//            } else {
//                if (nums[j] % 2 != 0) {
//                    j--;
//                }
//                if (nums[j] % 2 == 0) {
//                    int tmp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = tmp;
//                    i++;
//                    j--;
//                }
//            }
        }

        return nums;
    }

}
