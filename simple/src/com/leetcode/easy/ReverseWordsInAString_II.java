package com.leetcode.easy;

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

    private static char[] reverse(char[] processed, int i, int j) {
        if (processed == null || i < 0 || j < 0) {

            return processed;
        }
        while (i < j) {
            char temp = processed[i];
            processed[i] = processed[j];
            processed[j] = temp;
            i++;
            j--;
        }
        return processed;
    }

    public static void main(String[] args) {

        // original string
        String str = " Sony is going to introduce Internet TV soon ";
        System.out.println("Original String: " + str);

        System.out.println("Reservsed String: " + ReverseWordsInAString_II(str));
    }
}
