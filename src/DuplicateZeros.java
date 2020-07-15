import java.util.Arrays;
/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.



Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZeros {

    public static void main(String[] args) {
        int [] a = new int[]{1,0,2,3,0,4,5,0};
        duplicateZeros(a);
        System.out.println(Arrays.toString(a));
    }

    static public void duplicateZeros(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
//                if (n - 1 - i >= 0) System.arraycopy(arr, i, arr, i + 1, n - 1 - i);
                for (int j = n-1; i < j; j--) {
                    arr[j] = arr[j-1];

                }

                i++;
            }

        }

    }
}
