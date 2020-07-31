public class Pow {

    public static void main(String[] args) {
        System.out.println(myPow(2, 9));
    }

    static public double myPow(double x, int n) {
        double ans = helper(x, n);
        if (n < 0) ans = 1 / ans;
        return ans;
    }

    static private double helper(double x, int n) {
        if (n == 1) return x;
        if (n == 0) return 1;

        double half = helper(x, n / 2);
        if (n % 2 == 0) return half * half;
        return half * half * x;

    }
}
