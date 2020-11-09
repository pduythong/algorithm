package test;

import java.util.HashMap;
import java.util.Map;

public class test {

    /*
     *1. Write a function in Java that takes a string as its input and prints the letters in that string in reverse order,
     *  with the letters in the odd-numbered positions in upper-case and the letters in even-numbered positions in lower case.
     */

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
        System.out.println(reverse("abcd"));
        System.out.println(reverse("abcdefg"));
    }

    public static String reverse(String s) {
//        char[] chars = s.toCharArray();
//        char[] tmp = new char[s.length()];
//        int n = s.length() - 1;
//
//        for (int i = 0; i <= n; i++) {
//            int j = n - i;
//            char c;
//            if (j % 2 > 0) {
//                c = Character.toLowerCase(chars[i]);
//            } else {
//                c = Character.toUpperCase(chars[i]);
//            }
//            tmp[j] = c;
//        }
//        return new String(tmp);

        StringBuilder sb = new StringBuilder();
        int n = s.length()-1;
        for (int i = n; i >=0; i--) {
            char c ;

            if(i %2>0){
                c = Character.toLowerCase(s.charAt(i));
            }else
            {
                c =  Character.toUpperCase(s.charAt(i));
            }
            sb.append(c);

        }
        return sb.toString();

    }
    /*
     *2. Write Java code that defines an array, loads it with some data, and then loops through the members of that array. Do the same for a HashMap.
     */

    void print(int[] arr) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Book");
        map.put("C", "Cat");
        map.put("D", "Doctor");

        for (String key : map.keySet()
        ) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }


    }

}
