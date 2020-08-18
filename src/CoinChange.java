public class CoinChange {
    /*
    Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins,
     how many ways can we make the change? The order of coins doesn’t matter.
For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}.. So the output should be 4.
     */


    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 3}, 4));
    }

    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }

}
