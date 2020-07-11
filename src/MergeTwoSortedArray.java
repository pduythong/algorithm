import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 5, 6, 7, 9, 9,19};

        int[] arr2 = new int[]{5, 6, 7, 8,9, 15};

        int[] arr3 = mergeTwo(arr1, arr2);

//        for (int value : arr3) {
//            System.out.print(value + ",");
//        }
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mergeTwo(int[] arr1, int[] arr2) {

        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, n = 0, lastElement = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            int index = 0;
            if (arr1[i] < arr2[j]) {
                index = i++;
                if (lastElement != arr1[index]) {
                    mergeArr[k++] = arr1[index];
                    lastElement = arr1[index];
                    n++;
                }

            } else {
                index = j++;
                if (lastElement != arr2[index]) {
                    mergeArr[k++] = arr2[index];
                    lastElement = arr2[index];
                    n++;
                }
            }
        }

        while (i < arr1.length) {
            mergeArr[k++] = arr1[i++];
            n++;
        }

        while (j < arr2.length) {
            mergeArr[k++] = arr2[j++];
            n++;
        }

        int[] ans = new int[n];
//        if (ans.length >= 0) System.arraycopy(mergeArr, 0, ans, 0, ans.length);
        for (int l = 0; l < ans.length; l++) {
            ans[l] = mergeArr[l];

        }
        return ans;
    }
}
