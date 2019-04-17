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
https://github.com/mre/the-coding-interview/blob/master/problems/array-pair-sum/array-pair-sum.java
 */
class ArrayPairSum {

    public static int min(int sum, Integer[] arr) {
        HashMap hashMap = new HashMap() {
        };
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

    public static int min_1(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            result = result + nums[i * 2];
        }
        return result;
    }

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{6, 1, 3, 46, 1, 3, 9};
        //  System.out.println("ArrayPairSum " + ArrayPairSum.min(8, new Integer[]{3, 4, 5, 4, 4}));
        System.out.println("ArrayPairSum " + ArrayPairSum.min(47, integers));

    }
}