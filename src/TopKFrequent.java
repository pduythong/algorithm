import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/*
Given a non-empty array of integers, return the k most frequent elements.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.
 */
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for (int key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) heap.poll();
        }

        int[] ans = new int[k];
        int index =0;
        while (!heap.isEmpty()){
            ans[index++] = heap.poll();
        }

        return ans;

//        return res;

//        if(nums == null || nums.length ==0) return null;
//
//        Map<Integer, Integer> map = new HashMap<>();
////        Set<Integer> list = new HashSet<>();
//        int[] tmp = new int[nums.length + 1];
//
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        return map.entrySet().stream().filter(i -> i.getValue() >= k).mapToInt(Map.Entry::getKey).toArray();
    }
}
