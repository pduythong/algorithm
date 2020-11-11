public class ReserveAddPalindrome {
    /*
    The problem is as follows: choose a number, reverse its digits and add it to the original.
If the sum is not a palindrome (which means, it is not the same number from left to right and right to left), repeat this procedure.

For example:
195 (initial number) + 591 (reverse of initial number) = 786
786 + 687 = 1473
1473 + 3741 = 5214
5214 + 4125 = 9339 (palindrome)

In this particular case the palindrome 9339 appeared after the 4th addition.
This method leads to palindromes in a few step for almost all of the integers.
But there are interesting exceptions.
196 is the first number for which no palindrome has been found.
It is not proven though, that there is no such a palindrome.

Input sample:
Your program should accept as its first argument a path to a filename.
Each line in this file is one test case.
Each test case will contain an integer n is less than 10,000.
Assume each test case will always have an answer and
that it is computable with less than 100 iterations (additions).

Output sample:
For each line of input, generate a line of output which is the
number of iterations (additions) to compute the palindrome and
the resulting palindrome. (they should be on one line and separated
by a single space character).
For example:
4 9339
     */


    public static void main(String[] args) {
        solve(195);
    }

    static int reverse(int num) {
        int res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return res;
    }

    static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    static void solve(int num) {

        int count = 0;
        int sum = 0;
        int revNum = 0;
        do {
            revNum = reverse(num);
            sum = num + revNum;
            num = sum;
            count++;
        } while (!isPalindrome(sum));
        System.out.println(count + " " + sum);

    }
}




