
/*
 * 3/24/19 5:54 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
package com.kirkwang.easy;

class Spike {
    public static int findSpike(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        //   int[] input = new int[]{1, 2, 3, 8, 6, 10};
        int[] input = new int[]{3, 4, 5, 1, 2};
        System.out.println(findSpike(input));
    }
}