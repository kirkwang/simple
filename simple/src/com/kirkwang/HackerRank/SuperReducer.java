package com.kirkwang.HackerRank;

/**
 * Created by kewang on 10/31/17.
 */
public class SuperReducer {
    //aaabccddd
    public static void main(String[] args) {
        String input = "aaabccddd";
        //  input = input.substring(0, 1);
        input = input.substring(2);
        System.out.println(input + " simple input string");


        char[] array = input.toCharArray();
        int i = 0;
        int len = input.length();
        while (i < len - 1) {
            char left = input.charAt(i);
            char right = input.charAt(i + 1);
            if (left == right) {
                input = input.substring(0, i) + input.substring(i + 2);
                len = input.length();
                i = 0;
                System.out.println(input + " new input string");

                continue;
            }
            i++;
            System.out.println(input + " new input string");
        }

    }
}
