/*
 * 5/8/19 5:16 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.medium;

import java.util.Arrays;

/*
https://leetcode.com/problems/rotting-oranges/
 */
public class RottingOranges {

    public static int orangesRotting(int[][] grid) {
        int result = countOnes(grid);
        System.out.println(result);
        return result;
    }

    public static int countOnes(int[][] grid) {

        return Arrays.stream(grid).mapToInt(line -> Arrays.stream(line).filter(x -> x == 1).sum()).sum();
    }

    public static void main(String[] args) {
        int[][] input = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        RottingOranges.orangesRotting(input);
    }
}
