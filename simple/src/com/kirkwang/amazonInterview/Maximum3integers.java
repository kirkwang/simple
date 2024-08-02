/*
 * 4/5/19 8:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.amazonInterview;

import org.testng.Assert;

import java.util.Arrays;

/*
https://leetcode.com/problems/maximum-product-of-three-numbers/description/
Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6

 */
public class Maximum3integers {
    public static int maximum3Integers(int[] nums) {
        int result = 0;
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int case1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int case2 = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(case1, case2);


    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 67, 28, 0, -1, -30, -20};

        Assert.assertEquals(Maximum3integers.maximum3Integers(array), 40200);
        Assert.assertEquals(Maximum3integers.maximum3Integers(new int[]{-1, -2, -3}), -6);
        Assert.assertEquals(Maximum3integers.maximum3Integers(new int[]{1, 2, 3, 4}), 24);

    }
}
