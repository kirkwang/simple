/*
 * 4/28/19 2:19 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import java.util.HashMap;
import java.util.TreeSet;

/*
https://www.hackerrank.com/challenges/one-month-preparation-kit-sherlock-and-valid-string/problem
 */
public class SherlockandtheValidString {
    public static void main(String[] args) {

        String s = "abcdefghhgfedecba";
        String s1 = "aabbcd";

        String result = isValid(s1);
        System.out.println(result);

    }

    // Wrong answer
    static String isValid(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(hashMap.values());
        if (ts.size() <= 2) {
            if (Math.abs(ts.first() - ts.last()) == 1) {
                return "YES";
            }

        }
        return "NO";

    }
}
