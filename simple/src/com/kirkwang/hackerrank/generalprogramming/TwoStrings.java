package com.kirkwang.hackerrank.generalprogramming;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (Character c1 : s1.toCharArray()) {
            set.add(c1);
        }
        int counter = 0;
        for (Character c2 : s2.toCharArray()) {
            if (set.contains(c2)) {
                counter++;
            }
        }
        return counter > 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Assert.assertEquals(twoStrings("hello", "world"), "YES");
        Assert.assertEquals(twoStrings("hi", "world"), "NO");
    }
}
