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

/*
https://leetcode.com/problems/two-sum/description/
f(10, [3, 4, 5, 6, 7]) // [ [6, 4], [7, 3] ]
f(8, [3, 4, 5, 4, 4]) // [ [3, 5], [4, 4], [4, 4], [4, 4] ]
https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */
class ArrayPairSum {
    public static ArrayList<int[]> twoSum_int(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(new int[]{nums[i], nums[j]});
                }
            }
        }
        return result;
    }

    public static Object[] twoSum_obj(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer[]> list = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                Integer[] temp = new Integer[]{nums[left++], nums[right--]};
                list.add(temp);
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else right--;

        }
        return list.toArray();

    }


    public static void main(String[] args) {
        //--------------- not related to the question
        ArrayList<int[]> arrayInt = new ArrayList<>();
        int[] basicInt = new int[]{3, 4, 5, 6, 7};
        int[] integers = new int[]{6, 1, 3, 4, 1, 3, 9};
        arrayInt.add(basicInt);
        arrayInt.add(integers);

        for (int[] value : arrayInt) {
            for (int i : value) {
                //System.out.print(i);
            }
        }
        //--------------- not related to the question


        int[] input = new int[]{6, 3, 4, 1, 3, 9};

        ArrayList<Integer[]> list = new ArrayList<>();
        Integer[] expected = new Integer[]{1, 9};
        list.add(expected);
        expected = new Integer[]{4, 6};
        list.add(expected);
        Assert.assertEquals(ArrayPairSum.twoSum_obj(input, 10)[0], list.toArray()[0]);
        Assert.assertEquals(ArrayPairSum.twoSum_obj(input, 10)[1], list.toArray()[1]);


        ArrayList<int[]> twoSumExpected = new ArrayList<>();
        twoSumExpected.add(new int[]{1, 9});
        twoSumExpected.add(new int[]{4, 6});
        ArrayList<int[]> actual = ArrayPairSum.twoSum_int(input, 10);
        Assert.assertEquals(actual.toArray()[0], twoSumExpected.toArray()[0]);
        Assert.assertEquals(actual.toArray()[1], twoSumExpected.toArray()[1]);
    }
}