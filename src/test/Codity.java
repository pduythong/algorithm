package test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Codity {


    public static void main(String[] args) {
        String[] arr = new String[]{"abc1hdj8894f9-45hj", "abc954hdj8894f9-45hj",
                                     "abc01234hdj894f9-45hj", "abc1234hdj8894f9-45hj", "abc1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj",
                "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz012345hdj8894f9-45hj", "x012345hdj8894f9-45hj"};

        System.out.println(solution(arr));



    }


    static public boolean solution(String[] arr) {

        List<String> collect = Arrays.stream(arr).sorted(new SolutionComparator()).collect(Collectors.toList());

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(collect.get(i))) return false;
        }

        return true;

    }


    static class SolutionComparator implements Comparator<String> {
        Pattern compile = Pattern.compile("([a-zA-Z]*)(\\d*)");

        @Override
        public int compare(String s1, String s2) {
            Matcher matcher1 = compile.matcher(s1);
            Matcher matcher2 = compile.matcher(s2);
            int result = 0;
            while (matcher1.find()) {
                matcher2.find();
                String word1 = matcher1.group(1);
                String word2 = matcher2.group(1);
                if (word1.length() == word2.length()) {
                    result += word1.compareTo(word2);
                }else{
                    result += word2.compareTo(word1);
                }
                if (result == 0) {
                    try {
                        String l1 = matcher1.group(2);
                        String l2 = matcher2.group(2);
                        Integer number1 = Integer.parseInt(l1);
                        Integer number2 = Integer.parseInt(l2);
                        result += (number1 - number2);
                        if (result == 0) {
                            result += l1.compareTo(l2);
                        }

                    } catch (Exception ex) {

                    }
                }
            }

            return result;
        }
    }




    static boolean isSorted(String s1, String s2) {
        int i = 0;
        int j = 0;
        StringBuilder tmpS1 = new StringBuilder();
        StringBuilder tmpD1 = new StringBuilder();
        StringBuilder tmpS2 = new StringBuilder();
        StringBuilder tmpD2 = new StringBuilder();

        while (i < s1.length() && i < s2.length()) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);

            if (!Character.isDigit(c1)) {
                while ( !Character.isDigit(c1)) {
                    tmpS1.append(c1);
                    i++;
                    if(i < s1.length() )
                        c1 = s1.charAt(i);
                    else
                        break;
                }

                tmpD1.setLength(0);
            } else {
                while (Character.isDigit(c1)) {
                    tmpD1.append(c1);
                    i++;
                    if(i < s1.length() )
                        c1 = s1.charAt(i);
                    else
                        break;
                }
                tmpS1.setLength(0);

            }

            if (!Character.isDigit(c2)) {
                while ( !Character.isDigit(c2)) {
                    tmpS2.append(c2);
                    j++;
                    if(j < s2.length() )
                        c2 = s2.charAt(j);
                    else
                        break;
                }

                tmpD2.setLength(0);
            } else {
                while (Character.isDigit(c2)) {
                    tmpD2.append(c2);
                    j++;

                    if(j < s2.length() )
                        c2 = s2.charAt(j);
                    else
                        break;
                }
                tmpS2.setLength(0);

            }

            if (tmpS1.length() > 0 && tmpS2.length() > 0)
                if (tmpS1.toString().compareTo(tmpS2.toString()) > 0) return false;

            if (tmpD1.length() > 0 && tmpD2.length() > 0)
                if (Integer.parseInt(tmpD1.toString()) > Integer.parseInt(tmpD2.toString())) return false;

        }
        return true;
    }


}
