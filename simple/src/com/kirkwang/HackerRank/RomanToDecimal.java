package com.kirkwang.HackerRank;

public class RomanToDecimal {
    public static void romanToDecimal(java.lang.String romanNumber) {
        int result = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        /* operation to be performed on upper cases even if user
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    result = processDecimal(1000, lastNumber, result);
                    lastNumber = 1000;
                    break;

                case 'D':
                    result = processDecimal(500, lastNumber, result);
                    lastNumber = 500;
                    break;

                case 'C':
                    result = processDecimal(100, lastNumber, result);
                    lastNumber = 100;
                    break;

                case 'L':
                    result = processDecimal(50, lastNumber, result);
                    lastNumber = 50;
                    break;

                case 'X':
                    result = processDecimal(10, lastNumber, result);
                    lastNumber = 10;
                    break;

                case 'V':
                    result = processDecimal(5, lastNumber, result);
                    lastNumber = 5;
                    break;

                case 'I':
                    result = processDecimal(1, lastNumber, result);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println(result);
    }

    public static int processDecimal(int current, int lastNumber, int total) {
        if (lastNumber > current) {
            return total - current;
        } else {
            return total + current;
        }
    }

    public static void main(java.lang.String[] args) {
        String thirtySix = "XXXVI";

        romanToDecimal(thirtySix);
        // romanToDecimal("XIV");

    }
}