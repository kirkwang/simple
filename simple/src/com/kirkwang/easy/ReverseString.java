package com.kirkwang.easy;

import java.io.IOException;

/**
 * Created by amp on 9/24/2015.
 */
public class ReverseString {

    public static String ReverseString(String input) {
        if (input == null) {
            return null;
        }
        char[] chars = input.toCharArray();
        int j = chars.length - 1;
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[j - i];
            chars[j - i] = temp;

        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) throws IOException {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        System.out.println("Reservsed String: " + ReverseString(str));


    }

}



