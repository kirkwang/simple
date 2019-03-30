/*
 * 3/18/19 7:50 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.easy;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public IsAnagram() {
    }

    public static void main(String[] args) throws InterruptedException {
        String source = "aab";
        String target = "aba";

        String firstWord = "hellohackerrankhellohackerrankhellohackerrankhellohackerrankhellohackerrank";
        String secondWord = "kcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloe"; //take any string
        long begin = System.currentTimeMillis();
        checkAnagram(firstWord, secondWord);

        long end = System.currentTimeMillis() - begin;
        System.out.print("Total mil sec" + end);
    }

    public static boolean checkAnagram(String source, String target) {
        if (source.length() != target.length()) {
            return false;
        }
        if (source == null || target == null) {
            return false;

        }
        Map<Character, Integer> hashMap = new HashMap();

        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (hashMap.containsKey(c)) {
                if (hashMap.get(c) == 1) {
                    hashMap.remove(c);
                } else {
                    hashMap.put(c, hashMap.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return hashMap.size() <= 0;
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                return false;
            }
        }

        return true;
    }

}
