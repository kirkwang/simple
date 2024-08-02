/*
 * 3/20/19 5:06 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

import org.testng.Assert;

public class SearchInsert {
    /*
    https://leetcode.com/problems/search-insert-position/
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity. BinarySearch
    Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

     */
    public static void main(String[] args) {

        Assert.assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        Assert.assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
        Assert.assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;

    }
}
