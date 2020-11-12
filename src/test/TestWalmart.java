package test;

import com.sun.org.glassfish.gmbal.IncludeSubclass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestWalmart {

//    [1,2,1,2,3,2]


    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3,2};
//        System.out.println(solution(nums, 1, 2));
        System.out.println(solution(nums, 2, 3));
    }

   public static int solution(int[] nums,int n1, int n2){
       int n = nums.length;
       int firstIndex =-1;
       int secondIndex =0;

       int maxDiff = 0;

       for (int i = 0; i < n; i++) {

           if (firstIndex == -1 && nums[i] == n1){
               firstIndex=i;
           }

           if(nums[i]== n2){
               secondIndex = i;
           }
           maxDiff = Math.max(maxDiff, secondIndex-firstIndex -1);

       }


       return maxDiff;
//       Map<Integer, List<Integer>> map = new HashMap<>();
//
//       for (int i = 0; i < n; i++) {
//           if(map.containsKey(nums[i])){
//
//           }
//       }
//


    }



}
