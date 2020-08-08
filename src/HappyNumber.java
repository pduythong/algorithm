import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
(where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example:

Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(32));
        System.out.println(isHappy(18));
    }

    static public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int squareSum, remain;

        while (set.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n % 10;
                squareSum += remain * remain;
                n = n / 10;
            }

            if (squareSum == 1) return true;
            else
                n = squareSum;

        }

        return false;

//        return isHappyHelper(n, new HashSet<>());
    }

//    static public boolean isHappyHelper(int n, Set<Integer> cache) {
//        if (n == 1) return true;
//
//        if (!cache.add(n)) return false;
//
//        int next = 0;
//        while (n > 0) {
//            int r = n % 10;
//            next += r * r;
//            n = n / 10;
//        }
//        return isHappyHelper(next, cache);
//    }
}
