/*

Question:  Return the sum of all integers from a random String. Continuous Integers must be considered as one number.

Question: If the input String does not have any Integers, return 0.

Question: You may ignore decimals, float, and other non-integer numbers

Question: @param str : Input String

Question: Given the following inputs, we expect the corresponding output:

* "1a2b3c" => 6        (1+2+3)

* "123ab!45c" => 168   (123+45)

* "abcdef" => 0        (no Integers in String)

* "0123.4" => 127      (0123+4)

*  "dFD$#23+++12@#T1234;/.,10"  => 1279  (23+12+1234+10)

*  "dFD$#23+++12@#T1234;/.,10"  => 1279  (23+12+1234+10)

*"12a-10b"=>2

*"12a-b10"=>22
 */
public class SumNumbersInString {


    public static void main(String[] args) {
        System.out.println(sumIntegers("1a2b3c"));
//        System.out.println(new SumNumbersInString().sumIntegers("123ab!45c"));
//        System.out.println(new SumNumbersInString().sumIntegers("abcdef"));
//        System.out.println(new SumNumbersInString().sumIntegers("0123.4"));
//        System.out.println(new SumNumbersInString().sumIntegers("dFD$#23+++12@#T1234;/.,10"));
//        System.out.println(new SumNumbersInString().sumIntegers("12a-10b"));
//        System.out.println(new SumNumbersInString().sumIntegers("12a-b10"));
    }

    public static int sumIntegers(String s) {
        int n = s.length();
        int sum = 0, tmp = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                boolean isNegative = i - 1 >= 0 && s.charAt(i - 1) == '-';
                while (i < n && Character.isDigit(s.charAt(i))) {
                    tmp = tmp * 10 + (s.charAt(i) - '0');
                    i++;
                }

                sum += tmp * (isNegative ? -1 : 1);
                tmp = 0;
            }

        }
        return sum;

    }
}
