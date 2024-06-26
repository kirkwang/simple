package com.leetcode.easy;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */
public class FizzBuzz {
    public static void main(String[] args) {

        Assert.assertEquals(fizzBuzz(3).toString(), "[1, 2, Fizz]");
        Assert.assertEquals(fizzBuzz(5).toString(), "[1, 2, Fizz, 4, Buzz]");
        Assert.assertEquals(fizzBuzz(15).toString(), "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]");

    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            boolean diviableby3 = (i % 3 == 0);
            boolean diviableby5 = (i % 5 == 0);
            if (diviableby3 && diviableby5) {
                result.add("FizzBuzz");
            } else if (diviableby3) {
                result.add("Fizz");
            } else if (diviableby5) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
