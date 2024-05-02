package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kewang on 12/25/15.
 */
public class CountTwoArrays {

    public static void main(String[] args) {

        int[] one = new int[]{1, 3, 5};
        int[] two = new int[]{1, 2, 2, 4};
        HashMap<Integer, Integer> merged = countOnce(one, two);
        for (Map.Entry<Integer, Integer> aMerged : merged.entrySet()) {
            System.out.println(aMerged.getKey() + " " + aMerged.getValue());
        }
    }

    public static HashMap<Integer, Integer> countOnce(int[] one, int[] two) {
        boolean theEnd = true;
        int index = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();

        while (theEnd) {
            if (index < one.length) {
                hMap.put(one[index], hMap.getOrDefault(one[index], 0) + 1);
            }
            if (index < two.length) {
                hMap.put(two[index], hMap.getOrDefault(two[index], 0) + 1);
            }
            index++;

            if (index > one.length) {
                theEnd = false;
            } else if (index > two.length) {
                theEnd = false;
            }
        }
        return hMap;
    }
}
