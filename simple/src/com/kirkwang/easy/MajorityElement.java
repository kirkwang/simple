package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/29/15.
 */
/*

https://leetcode.com/problems/majority-element/description/

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    protected static Integer majorityElement(int[] numbs) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbs.length; i++) {
            if (hm.containsKey(numbs[i])) {
                Integer temp = hm.get(numbs[i]);
                hm.put(numbs[i], temp + 1);

            } else {
                hm.put(numbs[i], 1);
            }
        }
        for (Integer i : hm.keySet()) {
            int count = hm.get(i);
            if (count > numbs.length / 2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //  int[] array = new int[]{1, 1, 2, 4, 4, 4, 4, 5};
        int[] array = {1, 1, 2, 4, 4, 4, 4, 4, 5};
        Integer me = MajorityElement.majorityElement(array);
        System.out.print(me);
    }

    protected static class TestClassPrivateAccess {

        public static String name = "I'm a static variable";

        TestClassPrivateAccess() {
            System.out.println("I'm a private class");
        }
    }
}
