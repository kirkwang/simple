/*
 * 3/27/19 8:25 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.medium;

import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        MinAddToMakeValid matmv = new MinAddToMakeValid();
        int result = matmv.minAddToMakeValid("(((");
        System.out.println(result);
    }

    public int minAddToMakeValid(String input) {
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (stack.empty()) {
                stack.push(current);
            } else {
                char top = (char) stack.peek();
                if (matching(top, current)) {
                    stack.pop();
                } else {
                    stack.push(current);
                }
            }
        }
        return stack.size();
    }

    boolean matching(char left, char right) {
        return left == '(' && right == ')';
    }
}
