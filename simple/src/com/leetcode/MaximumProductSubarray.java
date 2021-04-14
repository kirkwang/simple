package com.leetcode;

public class MaximumProductSubarray {

  public static int MaximumProductSubarray(int[] nums) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      int current_sum = nums[i];
      for (int j = i; j < nums.length; j++) {
        current_sum = nums[i] + nums[j];
        if (current_sum > max) {
          max = current_sum;
        }
      }
    }
    return 0;
  }

  public static void main(java.lang.String args[]) {

    int[] input = new int[]{2, 3, -2, 4};

    System.out.println(MaximumProductSubarray(input));

  }
}
