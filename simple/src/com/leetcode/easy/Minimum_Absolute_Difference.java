package com.leetcode.easy;
/*

https://leetcode.com/problems/minimum-absolute-difference/

Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Example 2:
Input: arr = [1,3,6,10,15]
Output: [[1,3]]

Example 3:
Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]

*/

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Absolute_Difference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < diff) {
                diff = arr[i + 1] - arr[i]; //mini diff found
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == diff) {
                result.add(Arrays.asList(arr[i], arr[i + 1])); // adding all the matches
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> actual = minimumAbsDifference(new int[]{4, 2, 1, 3});
        List<int[]> expectedList = new ArrayList<>();
        expectedList.add(new int[]{1, 2});
        expectedList.add(new int[]{2, 3});
        expectedList.add(new int[]{3, 4});

        actual.retainAll(expectedList);
        Assert.assertEquals(actual.size(), 0);


        actual = minimumAbsDifference(new int[]{1, 3, 6, 10, 15});
        expectedList.clear();

        actual.retainAll(expectedList);
        Assert.assertEquals(actual.size(), 0);

    }
}
