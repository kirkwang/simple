package com.leetcode.easy;

//https://leetcode.com/problems/longest-continuous-increasing-subsequence/

public class Longest_Continuous_Increasing_Subsequence {

    public static int findLengthOfLCIS(int[] nums) {
        int answer = -1;
        int anchor = 0;
        if (nums == null || nums.length == 0) return answer;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) {
                anchor = i;
            }
            answer = Math.max(answer, i - anchor + 1);
        }
        return answer;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 4, 7};
        //   int[]nums = new int[]{2,2,2,2};
        //     String source = "axc", target = "ahbgdc";
        System.out.println("The result is " + Longest_Continuous_Increasing_Subsequence.findLengthOfLCIS(nums));
    }
}
