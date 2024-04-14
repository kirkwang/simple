
/*
 * 3/24/19 5:54 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
package com.kirkwang.medium;
// It is very similar to this task
//https://leetcode.com/problems/find-peak-element/

class Spike {
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