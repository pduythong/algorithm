import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
//        int[] arr1 = new int[]{3, 5, 6, 7, 9, 9, 19};
//
//        int[] arr2 = new int[]{5, 6, 7, 8, 9, 15};
//
////        int[] arr3 = mergeTwoSet(arr1, arr2);
////        int[] arr4 = mergeTwo(arr1, arr2);
//
////        for (int value : arr3) {
////            System.out.print(value + ",");
////        }
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));


//        int[] arr1 = new int[]{1,2,3,0,0,0};
//
//        int[] arr2 = new int[]{2,5,6};
//
//
//        merge(arr1, arr1.length, arr2, arr2.length);
//        System.out.println(Arrays.toString(arr1));

        int[] nums = new int[]{3,1,7,11};
        System.out.println(checkDup(nums));

    }


    public static boolean checkDup(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // Gia su nums1 co the chua nums2
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        int index = m-1;
        int i = m-n-1;
        int j = n-1;

        while (i >=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[index--] = nums1[i--];
            }else{
                nums1[index--] = nums2[j--];
            }
        }
        while ( i >=0 ){
            nums1[index--] = nums1[i--];
        }

        while ( j >=0 ){
            nums1[index--] = nums1[j--];
        }
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
