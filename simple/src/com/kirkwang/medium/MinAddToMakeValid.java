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
        int result = matmv.minAddToMakeValid("()))((");
        System.out.println(result);
    }

    public int minAddToMakeValid(String input) {
        Stack<Character> myStack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            if (myStack.isEmpty()) {
                myStack.push(input.charAt(i));
            } else {
                Character left = myStack.peek();
                if (matching(left, input.charAt(i))) {
                    myStack.pop();

                } else {
                    myStack.push(input.charAt(i));
                }
            }
        }
        return myStack.size();
    }

    public boolean matching(Character left, Character right) {
        return left.equals('(') && right.equals(')');
    }
}
