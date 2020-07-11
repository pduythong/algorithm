public class BinarySearch {
    public boolean binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] == key) return true;

            if (nums[mid] < key) low = mid + 1;

            if (nums[mid] > key) high = mid - 1;

        }
        return false;
    }
}
