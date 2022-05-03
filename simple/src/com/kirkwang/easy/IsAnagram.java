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
        String target = "abb";

        String firstWord = "hellohackerrankhellohackerrankhellohackerrankhellohackerrankhellohackerrank";
        String secondWord = "kcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloekcrhearaknhlloe"; //take any string
        long begin = System.currentTimeMillis();
        boolean result = checkAnagram(source, target);
        boolean result1 = IsAnagram(source, target);

        long end = System.currentTimeMillis() - begin;
        System.out.println("Total mil sec" + end);
        System.out.println("result is " + result);
        System.out.println("result 1 is " + result1);
    }

    public static boolean checkAnagram(String source, String target) {
        if (source == null || target == null) {
            return false;
        }
        if (source.length() == 0 || target.length() == 0) {
            return false;
        }
        if (source.length() != target.length()) return false;

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < source.length(); i++) {
            Character c = source.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        for (int i = 0; i < target.length(); i++) {
            Character t = target.charAt(i);
            if (hm.containsKey(t)) {
                if (hm.get(t) == 1) {
                    hm.remove(t);
                } else {
                    hm.put(t, hm.get(t) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.size() <= 0;
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
