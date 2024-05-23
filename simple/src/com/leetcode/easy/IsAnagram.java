/*
 * 3/18/19 7:50 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {


    public static void main(String[] args) {
        String source = "aab";
        String target = "aba";

        String firstWord = "hellohackerrankhellohackerrankhellohackerrankhellohackerrankhellohackerrank";
        String secondWord = "kcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloe"; //take any string

        Assert.assertTrue(checkAnagram(firstWord, secondWord));
        Assert.assertTrue(checkAnagram(source, target));
        Assert.assertTrue(IsAnagram(firstWord, secondWord));

    }

    public static boolean checkAnagram(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return false;
        }
        if (s.length() != t.length()) return false;

        Map<Character, Integer> hMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hMap.put(c, hMap.getOrDefault(c, 0) + 1);
        }
        for (char target : t.toCharArray()) {
            if (hMap.containsKey(target)) {
                if (hMap.get(target) == 1) {
                    hMap.remove(target);
                } else {
                    hMap.put(target, hMap.get(target) - 1);
                }
            } else {
                return false; //no key match
            }
        }
        return hMap.isEmpty();

    }

    public static boolean IsAnagram(String source, String target) {
        if (source == null || target == null) {
            return false;
        }
        if (source.length() != target.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < source.length(); i++) {
            arr[source.charAt(i) - 'a']++;
            arr[target.charAt(i) - 'a']--;
        }
        for (int j : arr) {
            if (j != 0) {

                return false;
            }
        }

        return true;
    }

}
