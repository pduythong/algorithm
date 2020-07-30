public class SecondSmallestInArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};

        System.out.println(secondSmallest(nums));
    }

    static public int secondSmallest(int[] nums) {
        int s1, s2;
        s1 = s2 = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < s1) {
                s1 = nums[i];
                s2 = s1;
            }
            if (nums[i] < s2 && nums[i] != s1) {
                s2 = nums[i];
            }
        }
        return s2;
    }

}
