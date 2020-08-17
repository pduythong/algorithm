import java.util.HashMap;

/*
Given a list of int, returns the all unique ints with no. of occurances in the list

a = {1,2,3,2,4,1,1}
O/p:
1 - 3
2 - 2
3 - 1
4 - 1
 */
public class DistinctArray {
    public static void main(String[] args) {
        System.out.println(distinctArray(new int[]{1, 2, 3, 2, 4, 1, 1}));
    }

    //    public static List<String> distinctArray(int[] nums) {
    public static HashMap<Integer, Integer> distinctArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
//        List<String> ans = new ArrayList<>();
//
//        for (Integer key : map.keySet()) {
//            ans.add(key + " - " + map.get(key));
//
//        }
//        return ans;

    }

}
