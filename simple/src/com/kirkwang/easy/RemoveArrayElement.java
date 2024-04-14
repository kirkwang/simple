package com.kirkwang.easy;

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
        RemoveArrayElement rd = new RemoveArrayElement();
        int[] removed = rd.removeArrayElement(new int[]{1, 4, 2, 2, 3, 4, 4}, 4);
        for (int aRemoved : removed) {
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
}
