import java.util.HashMap;
import java.util.Map;

public class BestAverageScore {

    public static void main(String[] args) {
        String[][] scores = new String[][]{{"Bob","85"},{"Mark","100"},{"Charles","63"},{"Mark","34"}};
        System.out.println(findAverage(scores));
    }

    public static int findAverage(String[][] scores) {
        int bestAverage = 0;
        Map<String, int[]> scoreMap = new HashMap<>();

        for (String[] score : scores) {
            String name = score[0];
            int currentScore = Integer.parseInt(score[1]);

            int[] tmp;
            if (scoreMap.containsKey(name)) {
                tmp = scoreMap.get(name);
                tmp[0] += currentScore;
                tmp[1]++;

            } else {
                tmp = new int[]{currentScore, 1};
            }
            scoreMap.put(name, tmp);
        }

        for (int[] value : scoreMap.values()) {
            int average = (int) Math.floor( value[0] / value[1]);
            bestAverage = Math.max(bestAverage, average);

        }
        return bestAverage;
    }
}
