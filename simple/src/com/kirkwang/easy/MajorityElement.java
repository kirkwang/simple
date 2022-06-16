package com.kirkwang.easy;

import java.util.HashMap;

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
        HashMap<Integer, Integer> myMap = new HashMap();
        for (int numb : numbs) {
            if (myMap.containsKey(numb)) {
                myMap.put(numb, myMap.get(numb) + 1);
            } else {
                myMap.put(numb, 1);
            }
        }
        for (Integer i : myMap.keySet()) {
            int val = myMap.get(i);
            if (val > numbs.length / 2) {
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
