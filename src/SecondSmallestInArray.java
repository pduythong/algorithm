public class SecondSmallestInArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};

        System.out.println(secondSmallest(nums));
    }

    static public int secondSmallest(int[] nums) {
        int n1, n2;
        n1 = n2 = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < n1) {
                n1 = nums[i];
                n2 = n1;
            }
            if (nums[i] < n2 && nums[i] != n1) {
                n2 = nums[i];
            }
        }
        return n2;
    }

}
