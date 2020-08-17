public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }

    public static double mySqrt(int number) {
        double tmp;
        double sr = number / 2;
        do {
            tmp = sr;
            sr = (tmp + (number / tmp)) / 2;

        } while (tmp - sr != 0);

        return sr;
    }
}
