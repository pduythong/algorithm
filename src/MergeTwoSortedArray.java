import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 5, 6, 7, 9, 9, 19};

        int[] arr2 = new int[]{5, 6, 7, 8, 9, 15};

        int[] arr3 = mergeTwoSet(arr1, arr2);
        int[] arr4 = mergeTwo(arr1, arr2);

//        for (int value : arr3) {
//            System.out.print(value + ",");
//        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    public static int[] mergeTwoSet(int[] a1, int[] a2) {
        Set<Integer> set = new LinkedHashSet<>();
        int i = 0, j = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                set.add(a1[i]);
                i++;
            } else {
                set.add(a2[j]);
                j++;
            }
        }

        while (i < a1.length) {
            set.add(a1[i]);
            i++;
        }

        while (j < a2.length) {
            set.add(a2[j]);
            j++;

        }

        int[] ans = new int[set.size()];

        int k = 0;
        for (Integer integer : set) {
            ans[k++] = integer;
        }

        return ans;

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
