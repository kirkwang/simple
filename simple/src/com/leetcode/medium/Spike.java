
/*
 * 3/24/19 5:54 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
package com.leetcode.medium;
// It is very similar to this task
/*
You must write an algorithm that runs in O(log n) time.
https://leetcode.com/problems/find-peak-element/
 */

class Spike {
    /*
    for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
     */
    public static int findSpike(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;

        while (head < tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] > nums[mid + 1]) {
                tail = mid;
            } else {
                head = mid + 1;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 1, 3, 5, 6, 4};
        //  int[] input = new int[]{1, 2, 1, 3, 8, 6, 4};
        System.out.println(findSpike(input));
    }
}