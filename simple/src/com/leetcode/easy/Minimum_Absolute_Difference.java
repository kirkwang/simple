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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Absolute_Difference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List result = new ArrayList();
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (min_diff > (arr[i + 1] - arr[i])) {
                min_diff = arr[i + 1] - arr[i];
            }
        }
        List temp = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == min_diff) {
                temp = new ArrayList<Integer>();

                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                result.add(temp);
            }

        }
        return result;
    }

    public static void main(String[] args) {


        //   int[] input = new int[]{4, 2, 1, 3};
        //   int[] input = new int[]{1,3,6,10,15};
        int[] input = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println(minimumAbsDifference(input));
    }
}
