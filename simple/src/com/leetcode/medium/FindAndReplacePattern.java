package com.leetcode.medium;/*
 * 3/27/19 6:14 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
https://leetcode.com/problems/find-and-replace-pattern/
 */
class FindAndReplacePattern {


    public static void main(String[] args) {
        FindAndReplacePattern frp = new FindAndReplacePattern();
        String[] array = new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String patten = "abb";
        List result = frp.findAndReplacePattern(array, patten);
        System.out.println(result.toString());
    }

    public  List findAndReplacePattern(String[] words, String pattern) {
         List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (checkPatten(words[i], pattern)) {
                arrayList.add(words[i]);
            }
        }
        return arrayList;
    }

    public static boolean checkPatten(String source, String target) {

        if (source.length() != target.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < source.length(); i++) {
            if (map1.containsKey(source.charAt(i))) {
                if (map1.get(source.charAt(i)) != target.charAt(i)) {
                    return false;
                }
            }
            if (map2.containsKey(target.charAt(i))) {
                if (map2.get(target.charAt(i)) != source.charAt(i)) {
                    return false;
                }
            }
            map1.put(source.charAt(i), target.charAt(i));
            map2.put(target.charAt(i), source.charAt(i));
        }

        return true;
    }
}