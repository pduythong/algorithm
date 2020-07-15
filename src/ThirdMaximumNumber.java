public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,1,2}));
    }


    static  public int thirdMax(int[] nums) {

        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;


//        int first = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//        int thrid = Integer.MIN_VALUE;
//
//        for (int num : nums) {
//            if (num > first) {
//                thrid = second;
//                second = first;
//                first = num;
//            } else if (num > second) {
//                thrid = second;
//                second = num;
//            } else {
//
//                thrid = num;
//            }
//        }
//
//        return thrid != Integer.MIN_VALUE? thrid: first;


    }
}
