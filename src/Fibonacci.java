import javax.sound.midi.SoundbankResource;

/*
Given a number N, we need to find the Fibonacci Series up to the N term.

The Fibonacci series is a series of elements where, the previous two elements are added to get the next element, starting with 0 and 1.

Examples:

Input: N = 10
Output: 0 1 1 2 3 5 8 13 21 34
Here first term of Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1) etc and so on.

Input: N = 15
Output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(fibo(i) + " ");

        }

//        System.out.println(fibo(2));
    }

    public static int fibo(int n) {

        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }
}
