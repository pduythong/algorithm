import java.util.Arrays;

public class PlushOne {


    public static void main(String[] args) {

        int[] nums = new int[]{9};

        System.out.println(Arrays.toString(plusOne(nums)));

    }

    static public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                if (i == 0) {
                    int[] digit1 = new int[digits.length + 1];
                    digit1[0] = 1;
                    digits = digit1;
                }else{
                    digits[i] = 0;
                }
            }


        }
        return digits;
    }
}
