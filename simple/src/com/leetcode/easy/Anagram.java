package com.leetcode.easy;

import org.testng.asserts.SoftAssert;

public class Anagram {


    public static int anagramV2(String s) {
        int n = s.length();

        if (n % 2 == 1) {
            return -1;
        }

        //Split the main string
        String left = s.substring(0, n / 2);
        String right = s.substring(n / 2, n);

        //Iterate the left string to verify if the letters are contained into the
        // right string
        for (int i = 0; i < n / 2; i++) {
            String c = left.substring(i, i + 1);
            if (right.contains(c)) {
                right = right.replaceFirst(c, "");
            }
        }
        return right.length();

    }

    public static void main(String[] args) {
        SoftAssert assertions = new SoftAssert(); // Here you'll be collecting your failures

        assertions.assertEquals(anagramV2("aaabbb"), 3);
        assertions.assertEquals(anagramV2("ab"), 1);
        assertions.assertEquals(anagramV2("abc"), -1);
        assertions.assertEquals(anagramV2("mnop"), 2);
        assertions.assertEquals(anagramV2("xyyx"), 0);
        assertions.assertEquals(anagramV2("xaxbbbxx"), 1);
        assertions.assertAll(); // in the end call this to fail your test if there were the faliures

    }
}
