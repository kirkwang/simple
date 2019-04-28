/*
 * 4/28/19 10:51 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.HashMap;

public class GameofThronesI {
    public static void main(String[] args) {
        String a = "cdcdcdcdeeeef";
        String b = "aaabbbb";

        System.out.println(gameOfThrones(b));
    }

    static String gameOfThrones(String s) {
        HashMap<Character, Integer> hashMap = new HashMap();
        for (Character c : s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                Integer t = hashMap.get(c);
                hashMap.put(c, ++t);
            }
        }
        int count = 0;
        for (Integer i : hashMap.values()) {
            if (i % 2 != 0) {
                count++;

            }
        }
        return count >= 2 ? "NO" : "YES";
    }
}
