import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {55, 23, 2, 5, 7, 1};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }


    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            } else {
                break;
            }

        }

        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }
}
