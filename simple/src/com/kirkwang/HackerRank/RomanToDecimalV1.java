package com.kirkwang.HackerRank;

import java.util.Hashtable;

public class RomanToDecimalV1 {

    public static int rtoi(String input) {

        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        ht.put('I', 1);
        ht.put('X', 10);
        ht.put('C', 100);
        ht.put('M', 1000);
        ht.put('V', 5);
        ht.put('L', 50);
        ht.put('D', 500);

        int result = 0;
        int preNumber = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int temp = ht.get(input.charAt(i));
            if (preNumber > temp) {

                result -= temp;

            } else {
                result += temp;

            }
            preNumber = temp;
        }

        return result;
    }

    public static void main(String args[]) {
        String thirtySix = "XXXVI";
        String twentyTwentyOne = "MMXII";
        String nintheenNitySix = "MCMXCVI";
        System.out.println(rtoi(thirtySix));
    }

}