/*
 * 3/20/19 5:06 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

public class SearchInsert {
    /*
    https://leetcode.com/problems/search-insert-position/
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity. BinarySearch
     */
    public static void main(String[] args) {
        int[] sortedArray = new int[]{1, 3, 5, 6};
        int target = 5;
        System.out.print(" index location " + searchInsert(sortedArray, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
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
