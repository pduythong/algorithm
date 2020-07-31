/*
. Group of N students sitting in a circular loop. Counting numbers from 1 to K and the kth student gets eliminated. Process is repeated till only one student remains. We need to write a code which will accept two inputs namely N and K and need to determine which student will be the last man standing.
10.	o For e.g. N=6, K=2,
11.	o Output = 5

 */
public class JosephusProblem {

    public static void main(String[] args) {
        System.out.println(solve(6, 2));
    }

    static public int solve(int n, int k) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res + k) % i;

        }
        return res + 1;
    }
}
