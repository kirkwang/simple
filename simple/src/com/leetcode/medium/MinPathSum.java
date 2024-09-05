/*
 * 3/17/19 4:42 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.medium;

import java.io.IOException;

/*
https://leetcode.com/problems/minimum-path-sum/description/
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12

 */
public class MinPathSum {

    public static void main(String[] args) throws IOException {
        //  [[1,3,1],[1,5,1],[4,2,1]]
        int[][] table = new int[][]{};

        int result = minPathSum(new int[2][2]);
        System.out.println(result);
    }

    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        // initialize top row
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        // initialize left column
        for (int j = 1; j < m; j++) {
            dp[j][0] = dp[j - 1][0] + grid[j][0];
        }

        // fill up the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
