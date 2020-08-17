import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
    }

    static public int[] sortedSquares(int[] a) {

        int[] ans = new int[a.length];

        int start = 0, end = a.length - 1;
        int i = end;

        while (start <= end) {
            int pow1 = a[start] * a[start];
            int pow2 = a[end] * a[end];

            if (pow1 > pow2) {
                ans[i--] = pow1;
                start++;
            } else {
                ans[i--] = pow2;
                end--;
            }
        }

        return ans;
    }
}
