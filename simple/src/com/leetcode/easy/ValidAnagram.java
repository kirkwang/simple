/*
 * 3/18/19 7:50 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.easy;
/*
https://leetcode.com/problems/valid-anagram/description/
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {


    public static void main(String[] args) {
        String firstWord = "hellohackerrankhellohackerrankhellohackerrankhellohackerrankhellohackerrank";
        String secondWord = "kcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloe"; //take any string

        Assert.assertTrue(checkAnagram(firstWord, secondWord));
        Assert.assertTrue(IsAnagram(firstWord, secondWord));

        Assert.assertTrue(checkAnagram("aab", "aba"));
        Assert.assertTrue(IsAnagram("anagram", "nagaram"));
        Assert.assertTrue(checkAnagram("anagram", "nagaram"));
        Assert.assertFalse(IsAnagram("rat", "car"));

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
        for (char c : t.toCharArray()) {
            if (hMap.containsKey(c)) {
                if (hMap.get(c) == 1) {
                    hMap.remove(c);
                } else {
                    hMap.put(c, hMap.get(c) - 1);
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
