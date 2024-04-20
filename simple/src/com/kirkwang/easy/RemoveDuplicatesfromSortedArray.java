package com.kirkwang.easy;

/**
 * Created by kewang on 12/24/15.
 */
/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
 */
@SuppressWarnings("Array")
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray rd = new RemoveDuplicatesfromSortedArray();
        int[] removed = rd.removeDuplicates(new int[]{2, 2, 2, 3, 4, 4});
        for (int aRemoved : removed) {
            System.out.println(aRemoved + " ");
        }
    }

    public int[] removeDuplicates(int[] numbs) {
        if (numbs == null || numbs.length < 1) {
            return numbs;
        }
        int index = 1;
        for (int i = 1; i < numbs.length; i++) {
            if (numbs[i - 1] != numbs[i]) {
                numbs[index++] = numbs[i];
            }
        }
        while (index < numbs.length) {
            numbs[index++] = 0;
        }
        return numbs;
    }
}
