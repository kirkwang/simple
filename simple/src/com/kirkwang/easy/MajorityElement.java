package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/29/15.
 */
/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    protected static Integer majorityElement(int[] numbs) {

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbs.length; i++) {
            if (map.containsKey(numbs[i])) {
                Integer count = map.get(numbs[i]);
                map.put(numbs[i], count + 1);
            } else {
                map.put(numbs[i], 1);
            }
        }
        for (int i : map.keySet()) {
            int count = map.get(i);
            System.out.println("count =>" + count);
            if (count > numbs.length / 2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //  int[] array = new int[]{1, 1, 2, 4, 4, 4, 4, 5};
        int[] array = {1, 1, 2, 4, 4, 4, 4, 5};
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
