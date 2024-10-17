/*
 * 4/25/19 8:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.HackerRank.generalProgramming;

import org.testng.Assert;

/*
https://www.hackerrank.com/challenges/making-anagrams/problem
 */
public class MakingAnagrams {

    public static void main(String[] args) {

        Assert.assertEquals(makingAnagrams("cde", "abc"), 4);
        Assert.assertEquals(makingAnagrams("abc", "amop"), 5);
    }

    public static int makingAnagrams(String s1, String s2) {

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        for (int i = 0; i < sb1.length(); i++) {
            int index = sb2.indexOf("" + sb1.charAt(i));
            if (index != -1) {
                sb1.deleteCharAt(i);
                sb2.deleteCharAt(index);
                i--;
            }
        }
        return sb1.length() + sb2.length();
    }


}
