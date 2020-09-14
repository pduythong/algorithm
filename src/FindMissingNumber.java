public class FindMissingNumber {

    /*
    You are given a list of n-1 integers and these integers are in the range of 1 to n.
     There are no duplicates in the list. One of the integers is missing in the list.
      Write an efficient code to find the missing integer.
     */

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}));
    }


    public static int findMissingNumber(int[] nums) {

        int total = (nums.length + 1) * (nums.length + 2) / 2;
        for (int num : nums) {
            total -= num;
        }

        return total;
    }
}
