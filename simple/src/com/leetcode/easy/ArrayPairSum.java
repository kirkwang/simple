/*
 * 3/24/19 5:56 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://leetcode.com/problems/array-partition-i/description/
 */
package com.leetcode.easy;

import org.testng.Assert;

/*
https://leetcode.com/problems/two-sum/description/
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */
class ArrayPairSum {

    public static void main(String[] args) {
        Assert.assertEquals(twoSum(new int[]{3, 3}, 4), new int[]{});
        Assert.assertEquals(twoSum(new int[]{3, 3}, 6), new int[]{0, 1});
        Assert.assertEquals(twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Assert.assertEquals(twoSum(new int[]{6, 3, 4, 1, 3, 9}, 10), new int[]{0, 2});

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }

        }
        return new int[]{};
    }
}