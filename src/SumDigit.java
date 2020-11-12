/*
Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.

Examples:

Input:  1abc23
Output: 24

Input:  geeks4geeks
Output: 4

Input:  1abc2x30yz67
Output: 100

Input:  123abc
Output: 123
 */

public class SumDigit {

    public static void main(String[] args) {
        System.out.println(findSum("1abc23"));
        System.out.println(findSum("1abc2x30yz67"));
    }


    public static int findSum(String s) {

        if (s.isEmpty()) return 0;

        int sum = 0;
        StringBuilder digits = new StringBuilder("0");
        for (Character c : s.toCharArray()) {

            if(Character.isDigit(c)){
                digits.append(c);
            }else{
                sum = sum + Integer.parseInt(digits.toString());
                digits = new StringBuilder("0");
            }

        }
        return sum + Integer.parseInt(digits.toString());
    }
}
