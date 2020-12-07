import java.util.HashMap;
import java.util.Map;

/*
1010. Pairs of Songs With Total Durations Divisible by 60
Easy

681

60

Add to List

Share
In a list of songs, the i-th song has a duration of time[i] seconds.

Return the number of pairs of songs for which their total duration in seconds is divisible by 60.  Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.



Example 1:

Input: [30,20,150,100,40]
Output: 3
Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60
Example 2:

Input: [60,60,60]
Output: 3
Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 */
public class NumPairDeviseBy60 {

    public static void main(String[] args) {
        System.out.println(numPairsDivisibleBy60(new int[]{30,20,150,100,40}));
    }


    static public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int t : time) {
            int key = (60 - t % 60) % 60;
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }

        return count;


    }

}
