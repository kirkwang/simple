package com.kirkwang.easy;

import java.io.IOException;

/**
 * Created by amp on 9/24/2015.
 */
public class ReverseString {

    public static String ReverseStance(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] reversed = input.split(" ");
        for (int i = 0; i < reversed.length / 2; i++) {
            String temp = reversed[i];
            reversed[i] = reversed[reversed.length - i - 1];
            reversed[reversed.length - i - 1] = temp;
        }

        return String.join(" ", reversed);
    }

    public static void ReverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = t;
        }

    }

    public static void main(String[] args) throws IOException {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        System.out.println("Reversed stance: " + ReverseStance(str));

        char[] charArray2 = "Son".toCharArray();
        ReverseString(charArray2);
        System.out.println("Reversed string Son : " + String.valueOf(charArray2));

    }

}



