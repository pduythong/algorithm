import java.util.*;

/*
You will be given an integer k and a list of integers. Count the number of distinct valid pair of integers (a,b) in the list for which a+k=b.

For example, the array [1,1,1,2] has two different
 valid pairs:(1,1) and (1,2). Note that the three possible instances od pair (1,1) count as a single valid pair, as do the three possible instances of the pair (1,2).
 if k=1, then this means we have total of one 1 valid pair which satisfies a+k=b=>1+1=2, the pair (1,2).
 */
public class CountingPairs {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(countingPairs(list, 1));
    }

    public static int countingPairs(List<Integer> nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            if (map.containsKey(num)) {
                if (k == 0 && map.get(num) == 1) {
                    ans++;
                }

                map.put(num, map.get(num) + 1);

            } else {
                if (map.containsKey(num - k)) {
                    ans++;
                }

                if (map.containsKey(num + k)) {
                    ans++;
                }
                map.put(num, 1);

            }

        }

        return ans;


//        int ans = 0;
//        HashSet<Integer> hLow = new HashSet<>();
//        HashSet<Integer> hHigh = new HashSet<>();
//
//        for (int a : nums) {
//            hLow.add(a);
//            hHigh.add(a + k);
//        }
//
//        for (int b : hHigh) {
//            if (hLow.contains(b)) ans++;
//        }
//
//        return ans;


    }

}
