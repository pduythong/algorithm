import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionTwoArray {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums1) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int num : nums2) {
            if (hashMap.getOrDefault(num, 0) != 0) {
                ans.add(num);
                hashMap.put(num, hashMap.get(num) - 1);
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();

    }

    public void solution(int n){
        for (int i = 0; i < n; i++) {
            if(i < n-1){
                System.out.println("L");
            }else{
                for (int j = 0; j < n; j++) {
                    System.out.print("L");

                }
            }


        }
    }



}



