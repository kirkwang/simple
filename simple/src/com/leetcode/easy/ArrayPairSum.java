/*
 * 3/24/19 5:56 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://leetcode.com/problems/array-partition-i/description/
 */
package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
f(10, [3, 4, 5, 6, 7]) // [ [6, 4], [7, 3] ]
f(8, [3, 4, 5, 4, 4]) // [ [3, 5], [4, 4], [4, 4], [4, 4] ]
https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */
class ArrayPairSum {

    public static List min_1(int total, Integer[] nums) {
        Arrays.sort(nums);
        List<ArrayList> list = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == total) {
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(nums[left++]);
                temp.add(nums[right--]);

                list.add(temp);

            } else if (nums[left] + nums[right] < total) {
                left++;
            } else right--;

        }
        return list;
    }

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{6, 1, 3, 4, 1, 3, 9};

        List<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(9);

        list.add(temp);
        temp = new ArrayList<>();
        temp.add(4);
        temp.add(6);
        list.add(temp);

        Assert.assertEquals(ArrayPairSum.min_1(10, integers), list);

    }
}