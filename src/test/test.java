package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test {
//    public static void main(String[] args) {
//        int[] nums = {0,11,4,0,44,0,0,9,8,0};
//        moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//
//    static public void moveZeroes(int[] nums) {
//        int l = 0, r = 1;
//
//        while (r < nums.length) {
//            if (nums[l] == 0 && nums[r] != 0) {
//                nums[l] = nums[r];
//                nums[r] = 0;
//                l++;
//                r++;
//
//            } else if (nums[l] == 0 && nums[r] == 0) {
//                r++;
//
//            }else{
//                l++;
//                r++;
//            }
//        }
//
//    }

    public static void main(String[] args) {
//        System.out.println(nestedAnagrams("bored cat", "act robed"));

        String x = new String("str");
        String y = new String("str");

//        Collections.sort();

        System.out.println(x == y); // prints false
        System.out.println(x.equals(y)); // prints true

    }

   static boolean nestedAnagrams(String s, String t) {

        if(s.isEmpty() || t.isEmpty()) return false;
        if(s.length() != t.length()) return false;

        String[] arrWord1 = s.split(" ");
        String[] arrWord2 = s.split(" ");

        Map<String, String> map1 = new HashMap();
        Map<String, String> map2 = new HashMap();

        for(String string: arrWord1){
            char[] tmp = string.toCharArray();
            Arrays.sort(tmp);
            map1.put(tmp.toString(), string);

        }


        for(String string: arrWord1){
            char[] tmp = string.toCharArray();
            Arrays.sort(tmp);
            map2.put(tmp.toString(), string);

        }

        for(String key: map1.keySet()){
            if(!map2.containsKey(key)) return false;
        }


        return true;


    }




}
