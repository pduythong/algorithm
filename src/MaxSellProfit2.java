/*
Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * */
public class MaxSellProfit2 {

    public static void main(String[] args) {
        System.out.println(maxSellProfit(new int[]{10, 80, 120, 130, 70, 60, 100, 125}));
        System.out.println(maxSellProfit(new int[]{100, 80, 70, 65, 60, 55, 50}));
    }


    public static int maxSellProfit(int[] nums){

        int i =0;
        int n = nums.length;
        int maxProfit = 0;
        int buy = 0;
        int sell = 0;

        while(i < n-1){
            while (i < n-1 && nums[i] >= nums[i+1]){
                i++;
            }

            buy = nums[i];

            while(i < n-1 && nums[i] <= nums[i+1]){
                i++;
            }

            sell = nums[i];
            maxProfit += sell-buy;

        }

        return maxProfit;
    }

}
