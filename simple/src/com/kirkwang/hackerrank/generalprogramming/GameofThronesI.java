/*
 * 4/28/19 10:51 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.HashMap;

/*
https://www.hackerrank.com/challenges/game-of-thrones/problem
 */
public class GameofThronesI {
    public static void main(String[] args) {

        Assert.assertEquals(gameOfThrones("cdcdcdcdeeeef"), "YES");
        Assert.assertEquals(gameOfThrones("aaabbbb"), "YES");
        Assert.assertEquals(gameOfThrones("cdefghmnopqrstuvw"), "NO");

    }

    static String gameOfThrones(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Integer i : hashMap.values()) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count > 1 ? "NO" : "YES";
    }
}
