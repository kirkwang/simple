package com.kirkwang.easy;

/*https://leetcode.com/problems/unique-number-of-occurrences/
        Example 1:

        Input: arr = [1,2,2,1,1,3]
        Output: true
        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
        Example 2:

        Input: arr = [1,2]
        Output: false
        Example 3:

        Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
        Output: true
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public static Object[] uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i : arr) {
            //  for (int i = 0; i < arr.length; i++) {
            myMap.put(i, myMap.getOrDefault(i, 1) + 1);
        }
        ArrayList<Integer> abc = new ArrayList<>();
        abc.toArray();

        HashSet<Integer> set = new HashSet<>(myMap.values());
        return abc.toArray();
/*
        HashSet mySet = new HashSet();
        for (Integer num : myMap.values()) {
            if (!mySet.add(num)) {
                return false;
            }
        }
        return true;
*/
    }

    public static void main(String[] args) {

        //    int[] target = new int[]{1, 2};
        int[] target = new int[]{1, 2, 2, 1, 1, 3};
        System.out.print(uniqueOccurrences(target));

    }
}
