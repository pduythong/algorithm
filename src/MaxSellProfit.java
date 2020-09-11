/*
 * Given an array representing prices of the stock on different days,
 * find the maximum profit that can be earned by performing maximum of one transaction.
 * A transaction consists of activity of buying and selling the stock on different or same days.
 *
 * Eg: 1 - {100, 80, 120, 130, 70, 60, 100, 125}
 * the price of the stock on day-1 is 100, on day-2 is 80 and so on.
 * The maximum profit that could be earned in this window is 65 (buy at 60 and sell at 125).
 *
 * Eg: 2 - For price array - {100, 80, 70, 65, 60, 55, 50}, maximum profit that could be earned is 0.
 *
 * */
public class MaxSellProfit {

    public static void main(String[] args) {
        System.out.println(maxSellProfit(new int[]{100, 80, 120, 130, 70, 60, 100, 125}));
        System.out.println(maxSellProfit(new int[]{100, 80, 70, 65, 60, 55, 50}));
    }


    public static int maxSellProfit(int[] nums){
        int minimumPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int num : nums) {
            maxProfit = Math.max(maxProfit, num - minimumPrice);
            minimumPrice = Math.min(minimumPrice, num);
        }
        return maxProfit;
    }

}
