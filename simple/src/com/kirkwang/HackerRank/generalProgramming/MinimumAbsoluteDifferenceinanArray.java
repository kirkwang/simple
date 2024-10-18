/*
 * 5/5/19 11:07 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
 */
public class MinimumAbsoluteDifferenceinanArray {
    public static void main(String[] args) {

        Assert.assertEquals(minimumAbsoluteDifference(Arrays.asList(1, -3, 71, 68, 17)), 3);
        Assert.assertEquals(minimumAbsoluteDifference(Arrays.asList(3, -7, 0)), 3);
        Assert.assertEquals(minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)), 1);

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {

        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.size(); i++) {
            min = Math.min(arr.get(i) - arr.get(i - 1), min);
        }

        return min;
    }
}
