/*
Q. Given a series of coins, we want to arrange them in alternative sequence of head and tails.
Write a function to return minimum number of coin flips required to obtain sequence, if Heads is 0 and Tails is 1.

E.g.
{1, 1, 0, 1, 1}
Ans = 2, since we need to flip 1st and 5th coin

{1, 0, 1}
Ans = 0, since sequence is correct
 */
public class FlipStringToBinary {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 1, 0, 1, 1};
        int[] arr = new int[]{1, 0, 1};
        System.out.println(flipCoin(arr));
    }

    public static int flipCoin(int[] arr) {
        int count = 0;
        int expected = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] == 1) {
                expected = 0;
            } else {
                expected = 1;
            }

            if (arr[i] != expected) count++;



        }
        return count;

    }
}
