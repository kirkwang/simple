package com.leetcode;

public class Repeated_Substring_Pattern {

    public static boolean Repeated_Substring_Pattern(String input) {
        int len = input.length();
        for (int i = len / 2; i > 1; i--) {
            if (len % i == 0) {  //check if it is even for 3%1 or 4%2
                int numberOfRepeat = len / i;
                String subString = input.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < numberOfRepeat; j++) {
                    sb.append(subString);
                }
                if (sb.toString().equals(input)) return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        String input = "abab";
//        String input = "abc";

        System.out.println("The result is " + Repeated_Substring_Pattern.Repeated_Substring_Pattern(input));
    }
}
