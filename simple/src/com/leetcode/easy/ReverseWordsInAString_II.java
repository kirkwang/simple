package com.leetcode.easy;

import org.testng.Assert;

/**
 * Created by kewang on 12/14/17.
 */
public class ReverseWordsInAString_II {

    public static String ReverseWordsInAString_II(String input) {
        if (input == null) {
            return input;
        }
        char[] processed = input.trim().toCharArray();

        reverse(processed, 0, processed.length - 1);

        int head = 0;
        for (int i = 0; i < processed.length; i++) {
            char endChar = processed[i];
            if (endChar == ' ') {
                reverse(processed, head, i - 1); // done with swap
                head = i + 1; // skip space char
            }
        }
        reverse(processed, head, processed.length - 1);

        return String.valueOf(processed);
    }

    private static void reverse(char[] target, int i, int j) {
        if (target == null || i < 0 || j < 0) {
            return;
        }
        while (i < j) {
            char temp = target[i];
            target[i] = target[j];
            target[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Assert.assertEquals(ReverseWordsInAString_II(" Sony is going to introduce Internet TV soon "), "soon TV Internet introduce to going is Sony");
    }
}
