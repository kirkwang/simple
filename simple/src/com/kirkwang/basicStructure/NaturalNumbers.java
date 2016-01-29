package com.kirkwang.basicStructure;

/**
 * Created by kewang on 2/17/16.
 */
public class NaturalNumbers {

    public static void main(String[] args) {
        int i, sum = 0;

        for (i = 0; i < 1000; i++) {
            if ((i % 5 == 0) || (i % 3 == 0)) {
                sum += i;
            }
        }
        System.out.printf("The sum is " + sum);

    }
}
