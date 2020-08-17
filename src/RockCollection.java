
/* Problem Name is &&& Optimal Path &&& PLEASE DO NOT REMOVE THIS LINE. */

/*
 ** Instructions to candidate.
 **  1) You are an avid rock collector who lives in southern California. Some rare
 **     and desirable rocks just became available in New York, so you are planning
 **     a cross-country road trip. There are several other rare rocks that you could
 **     pick up along the way.
 **
 **     You have been given a grid filled with numbers, representing the number of
 **     rare rocks available in various cities across the country.  Your objective
 **     is to find the optimal path from So_Cal to New_York that would allow you to
 **     accumulate the most rocks along the way.
 **
 **     Note: You can only travel either north (up) or east (right).
 **  2) Consider adding some additional tests in doTestsPass().
 **  3) Implement optimalPath() correctly.
 **  4) Here is an example:
 **                                                           ^
 **                 {{0,0,0,0,5}, New_York (finish)           N
 **                  {0,1,1,1,0},                         < W   E >
 **   So_Cal (start) {2,0,0,0,0}}                             S
 **                                                           v
 **   The total for this example would be 10 (2+0+1+1+1+0+5).
 */
public class RockCollection {

    public static void main(String[] args) {
        System.out.println(findPath(new int[][]{{0, 0, 0, 0, 5},
                {0, 1, 1, 1, 0},
                {2, 0, 0, 0, 0}}));
    }

    public static int findPath(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] sum = new int[n][m];

        sum[n - 1][0] = grid[n - 1][0];
        // last column.
        for (int i = 1; i < n; i++)
            sum[n - 1][i] = sum[n - 1][i - 1] + grid[n - 1][i];

        for (int j = n - 2; j >= 0; j--)
            sum[j][0] = sum[j + 1][0] + grid[j][0];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= m - 1; j++) {
                sum[i][j] = Integer.max(sum[i + 1][j], sum[i][j - 1]) + grid[i][j];
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }

        return sum[0][m- 1];
    }
}
