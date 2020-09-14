
/*
 * Given a sorted array of integers, return the low and high index of the given key.
 * Return -1 if not found. The array length can be in millions with lots of duplicates.

 * Linear search might be inefficient if the arr length exceeds a millions elements
 * so we can use a modified version of binary search
 * */

/*
 * Since we are using binary search the runtime complexity is Logarithmic, O(logn).
 * Memory Complexity = O(1)
 * */
public class LowHighIndex {

    public static void main(String[] args) {
//        findIndex(new int[]{1, 2, 3, 4, 5}, 3);
//
//        findLowestHighestIndex(new int[]{1, 2, 3, 4, 5}, 3);


        int[] arr = {1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 20};
        findLowestHighestIndex(arr, 5);

        findIndex(arr,5);

    }

    public static void findIndex(int[] nums, int key) {

        System.out.println(findLow(nums, 0, nums.length-1, key));
        System.out.println(findHigh(nums, 0, nums.length-1, key));

    }

    public static int findLow(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || key > arr[mid - 1]) && arr[mid] == key)
                return mid;
            else if (key > arr[mid])
                return findLow(arr, (mid + 1), high, key);
            else
                return findLow(arr, low, (mid - 1), key);
        }
        return -1;
    }

    public static int findHigh(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == arr.length - 1 || key < arr[mid + 1]) && arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                return findHigh(arr, low, (mid - 1), key);
            else
                return findHigh(arr, (mid + 1), high, key);
        }
        return -1;
    }

    public static void findLowestHighestIndex(int[] arr, int key) {
        int lowestIndex = arr.length - 1;
        int highestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (i < lowestIndex) {
                    lowestIndex = i;

                }
                if (i > highestIndex) {
                    highestIndex = i;
                }
            }
        }
        System.out.println(lowestIndex + " " + highestIndex);
    }


}
