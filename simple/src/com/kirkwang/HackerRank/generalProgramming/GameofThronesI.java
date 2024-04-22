/*
 * 4/28/19 10:51 AM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/game-of-thrones/problem
 */
public class GameofThronesI {
    public static void main(String[] args) {
        String a = "cdcdcdcdeeeef";

        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(gameOfThrones(a));
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
        return count >= 2 ? "NO" : "YES";
    }
}
