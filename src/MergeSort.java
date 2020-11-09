public class MergeSort {


    public static int[] mergeSort(int[] arr, int lowerIndex, int upperIndex) {

        if (arr.length == 1) return arr;

        if (lowerIndex >= upperIndex) return arr;

        int median = (lowerIndex + upperIndex) / 2;

        mergeSort(arr, lowerIndex, median);
        mergeSort(arr, median + 1, upperIndex);
        merge(arr, lowerIndex, median, upperIndex);

        return arr;

    }

    private static void merge(int[] arr, int lowerIndex, int median, int upperIndex) {
        int[] tmpArr = new int[arr.length];

        System.arraycopy(arr, 0, tmpArr, 0, arr.length);

        int i = lowerIndex;
        int j = median + 1;
        int k = lowerIndex;

        while (i < median && j <= upperIndex) {
            if (tmpArr[i] < tmpArr[j]) {
                arr[i] = arr[k];
                i++;
            } else {
                arr[k] = tmpArr[i];
                j++;
            }
            k++;
        }
        while (i <= median) {
            arr[k] = tmpArr[i];
            i++;
            k++;
        }

    }

}
