package com.kirkwang.easy;

/**
 * Created by kewang on 12/14/17.
 * <p>
 * https://leetcode.com/problems/reverse-words-in-a-string/description/
 * <p>
 * Reverse Words in a String
 * <p>
 * Given an input string, reverse the string word by word.
 * <p>
 * For example, Given s = "the sky is blue", return "blue is sky the".
 */
public class ReverseWordsInAString_I {

    public static String ReverseWordsInAString(String input) {

        if (input == null) {
            return input;
        }

        String noSpaces = input.trim().replaceAll("\\s+", ":");
        String[] strings = noSpaces.split(":");
        int j = strings.length - 1;
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[j - i];
            strings[j - i] = temp;
        }
        String joined = String.join(" ", strings);
        return joined.trim();
    }

    public static void main(String[] args) {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        System.out.println("Reservsed String: " + ReverseWordsInAString("   a   b "));
        System.out.println("Reservsed String: " + ReverseWordsInAString(str));


    }


}
