/*
 * 3/17/19 1:29 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
//https://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/

package com.kirkwang.easy;

import java.io.IOException;
import java.util.Stack;

public class EvaluateValue {


    public static void main(String[] args) throws IOException {
        String[] tokens = new String[]{"2", "1", "+"};
        System.out.println(evaluate(tokens));
    }

    public static int evaluate(String[] token) {
        Stack<String> stack = new Stack();
        String operator = "+-*/";

        for (String t : token) {
            //if it's not operator or it's a number, push to stack
            if (!operator.contains(t)) {
                stack.push(t);
            } else {
                // when there is operator, pop two of them
                int x = Integer.valueOf(stack.pop());
                int y = Integer.valueOf(stack.pop());

                int index = operator.indexOf(t);
                switch (index) {
                    case 0: {
                        stack.push(String.valueOf(x + y));
                        break;
                    }
                    case 1: {
                        stack.push(String.valueOf(y - x));
                        break;
                    }
                    case 2: {
                        stack.push(String.valueOf(x * y));
                        break;
                    }
                    case 3: {
                        stack.push(String.valueOf(y / x));
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(stack.pop());

    }
}
