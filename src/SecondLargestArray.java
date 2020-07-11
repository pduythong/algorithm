public class SecondLargestArray {

    static public int get2LargestArray(int[] nums) {
        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

}
