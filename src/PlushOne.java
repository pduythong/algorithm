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


//        int cary = 1;
//
//        for(int i =digits.length-1; i >= 0; i--){
//            int sum = digits[i] + cary;
//            digits[i] = sum%10;
//            cary = sum/10;
//
//        }
//
//        if(cary == 1){
//            int[] output = new int[digits.length +1];
//            output[0] = 1;
//            System.arraycopy(output,1, digits,0, digits.length);
//
//
//        }
//
//        return digits;

    }
}
