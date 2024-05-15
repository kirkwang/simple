/*
 * 3/27/19 8:25 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode.medium;

import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        MinAddToMakeValid matmv = new MinAddToMakeValid();
        int result = matmv.minAddToMakeValid("())");
        System.out.println(result);
    }

    public static int minAddToMakeValid(String input) {
        int result = 0;
        if (input.isEmpty()) {
            return result;
        }
        Stack<Character> s = new Stack<>();
        for (Character c : input.toCharArray()) {
            if (s.empty()) {
                s.push(c);
            } else {
                Character temp = s.peek();
                if (matching(temp, c)) {
                    s.pop();
                } else {
                    s.push(c);
                }
            }
        }
        return s.size();
    }

    public static boolean matching(Character left, Character right) {
        return left.equals('(') && right.equals(')');
    }
}
