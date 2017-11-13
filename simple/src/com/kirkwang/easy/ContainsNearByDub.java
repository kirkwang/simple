package com.kirkwang.easy;

import java.util.HashMap;

/**
 * Created by kewang on 3/3/16.
 */
public class ContainsNearByDub {
    public static void main(String[] args) {
        int[] numbs = {1, 4, 5, 1, 56, 22, 4};
        System.out.println(ContainsNearByDub(numbs, 3));
    }

    public static boolean ContainsNearByDub(int[] numbs, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbs.length; i++) {
            if (map.containsKey(numbs[i])) {
                int prevLoc = map.get(numbs[i]);
                if (i - prevLoc <= k)
                    return true;
            }
            map.put(numbs[i], i);
        }

        return false;
    }

}
