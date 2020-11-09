package test;

import java.util.ArrayList;
import java.util.List;

public class Result {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        sumOfTheDigits(list).forEach(System.out::println);
    }


    public static List<Integer> sumOfTheDigits(List<Integer> q) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();

        for (int num : q) {
            res.add(getSum(num));
        }
        return res;

    }

    private static int getSum(int n) {

        String result = "1";

        if(n == 1) return 1;
        if(n ==2 ) return 2;

        int i = 1;
        int sum =0;

        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));

                    count = 1;
                }
            }

            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            sum += count;
            i++;
        }

        // int sum = sum(result);

        return sum;
    }


    static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        return sum;
    }


}
