/*
 * Given a integer
 * Input - 4321
 * Output - 1234
 * */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123456));
    }

    public static int reverse(int num) {
        int res = 0;
        while (num > 0) {
            res = res * 10;
            res = res + (num % 10);
            num = num / 10;
        }
        return res;

    }
}
