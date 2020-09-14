import java.util.Arrays;
/*
 * Given an integer array, move all elements containing '0' to the left while maintaining the order of
 * other elements in the array.
 * Runtime Complexity = Linear, O(n).
 * Memory Complexity = Constant, O(1).
 *
 * Step 1: Keep two markers (readIndex and writeIndex) and point them to the end of the array
 * Step 2: If readIndex < 0, skip
 * Step 3: Iterate through the array in reverse, & if current element points to non zero,
 *         update the array current element to readindex element & increment writeIndex
 * */
public class MoveZeroToLeft {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 0, 5, 6, 8, 0};
        moveToLeft(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void moveToLeft(int[] nums) {

        int writeIndex = nums.length - 1;
        int readIndex = nums.length - 1;

        while (readIndex >= 0) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex--;
            }
            readIndex--;

        }
        while (writeIndex >= 0) {
            nums[writeIndex] = 0;
            writeIndex--;
        }

    }
}
