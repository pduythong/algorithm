import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {55, 1, 9, 6, 11, 8, 3};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int lower, int upper) {

        if (arr.length == 1) return arr;

        if (lower >= upper) return arr;

        int mid = (lower + upper) / 2;

        mergeSort(arr, lower, mid);
        mergeSort(arr, mid + 1, upper);
        merge(arr, lower, mid, upper);

        return arr;

    }

    public static void merge(int[] arr, int lower, int mid, int upper) {
        int[] tempArr = new int[arr.length];

        System.arraycopy(arr, 0, tempArr, 0, upper + 1);

        int i = lower;
        int j = mid + 1;
        int k = lower;

        while (i <= mid && j <= upper) {
            if (tempArr[i] < tempArr[j]) {
                arr[k] = tempArr[i];
                i++;

            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }

    }

}
