package com.leetcode.easy;

/**
 * Created by kewang on 12/24/15.
 */
/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
@SuppressWarnings("Array")
public class RemoveArrayElement {

    public static void main(String[] args) {
        //  int[] inputArray = new int[]{1, 2, 2, 2, 3, 4, 4};
        int[] inputArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

        RemoveArrayElement rd = new RemoveArrayElement();
        int result = rd.removeElement(inputArray, 4);
        System.out.println(result + " removeElement result ");
        rd.printArray(inputArray);

        result = rd.removeElement_v1(inputArray, 4);

        System.out.println(result + " removeElement_v1 result ");
        int[] removed = rd.removeArrayElement(inputArray, 4);
        rd.printArray(removed);
    }

    private void printArray(int[] input) {
        for (int aRemoved : input) {
            System.out.print(aRemoved + " ");
        }
    }

    public int[] removeArrayElement(int[] numbs, int val) {
        int index = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] != val) {
                numbs[index++] = numbs[i];
            }
        }
        while (index < numbs.length) {
            numbs[index++] = 0;
        }
        return numbs;
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int uniqe = 0;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] != val) {
                nums[uniqe] = nums[index];
                uniqe++;
            }
            index++;
        }
        return uniqe;

    }

    public int removeElement_v1(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int i = 0;
        for (int n : nums) {
            if (n != val) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
