/*
 * 4/25/19 8:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

public class MakingAnagrams {

    public static void main(String[] args) {
        String a = "cde";
        String b = "abc";

        System.out.println(makeAnagram(a, b));
    }

    private static int[] createFilledArray(String str) {
        int[] letter2count = new int[26];
        str.chars().forEach(letter -> letter2count[letter - 'a']++);
        return letter2count;
    }

    private static int[] createFilledArrayJava8(String str) {
        int[] array = new int[26];

        str.chars().forEach(s -> array[s - 'a']++);
        return array;
    }

    static int makeAnagram(String a, String b) {
        int[] aCount = createFilledArrayJava8(a);
        int[] bCount = createFilledArrayJava8(b);
        int different = 0;
        for (int i = 0; i < aCount.length; i++) {
            different += Math.abs(aCount[i] - bCount[i]);
        }
        return different;
    }
}
