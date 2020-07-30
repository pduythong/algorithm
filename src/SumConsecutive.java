import java.util.Arrays;

/*
Question: Given an array of integers, return an array of integers which contains
[1st integer, Sum of next 2 integers (2nd, 3rd), Sum of next 3 integers (4th, 5th, 6th)]

Input size n
[1,6,8,5,9,4,7,2]
Output size m
[1,14,18,9]
 */
public class SumConsecutive {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sumConsecutive1(new int[]{1,6,8,5,9,4,7,2,1,2})));
        System.out.println(Arrays.toString(sumConsecutive(new int[]{1,6,8,5,9,4,7,2,1,2})));
    }

   static public int[] sumConsecutive(int[] nums) {
        if (nums.length <= 2) return nums;

        int sum = 0;
        int index = 0;
        int count = 1;
        int currentCount = 1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            currentCount--;
            if (currentCount == 0) {
                nums[index++] = sum;
                sum = 0;
                currentCount = ++count;
            }
//            if (i == nums.length - 1) {
//                nums[current++] = sum;
//            }
        }
       if (sum > 0) {
           nums[index++] = sum;
       }

        int[] ans = new int[index];

       if (index >= 0) System.arraycopy(nums, 0, ans, 0, index);
//       for (int i = 0; i < index; i++) {
//           ans[i] = nums[i];
//       }
        return ans;

    }

    static   public int[] sumConsecutive1(int[] nums) {
        int sum = 0;
        int j = 0, i = 0, ctr = 0;
        int next = 1;

        while (i < nums.length) {
            ctr++;
            sum += nums[i];

            if (ctr == next) {
                nums[j] = sum;
                j++;
                sum=0;
                ctr = 0;
                next++;
            }
            i++;
        }

        if (ctr != 0)
            nums[j] = sum;

        int[] ans = new int[j];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = nums[k];
        }
        return  ans;
    }

}
