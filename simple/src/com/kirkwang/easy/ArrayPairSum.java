/*
 * 3/24/19 5:56 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 * https://leetcode.com/problems/array-partition-i/description/
 */
package com.kirkwang.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
f(10, [3, 4, 5, 6, 7]) // [ [6, 4], [7, 3] ]
f(8, [3, 4, 5, 4, 4]) // [ [3, 5], [4, 4], [4, 4], [4, 4] ]
https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */
class ArrayPairSum {

    public static int min(int sum, Integer[] arr) {
        HashMap<Integer, Boolean> hashMap = new HashMap();
        Set set = new HashSet();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int compent = sum - arr[i];
            if (hashMap.containsKey(compent)) {
                System.out.println(arr[i] + " " + compent);
                set.add(arr[i] + "," + compent);

            } else {
                hashMap.put(arr[i], true);
            }
        }

        System.out.println(set.size() + "  set size");
        return result;
    }

    public static int min_1(int total, Integer[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == total) return 1;
            else if (nums[left] + nums[right] < total) left++;
            else right--;
        }
        return 0;
    }

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{6, 1, 3, 46, 1, 3, 9};
        //  System.out.println("ArrayPairSum " + ArrayPairSum.min(8, new Integer[]{3, 4, 5, 4, 4}));
        System.out.println("ArrayPairSum " + ArrayPairSum.min_1(5, integers));

    }
}