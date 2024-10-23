/*
 * 3/17/19 1:29 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */
//https://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/

package com.leetcode.easy;

import org.testng.Assert;

import java.util.Stack;

public class EvaluateValue {

    public static void main(String[] args) {

        Assert.assertEquals(evaluate(new String[]{"2", "1", "+"}), 3);
        Assert.assertEquals(evaluate(new String[]{"2", "3", "+"}), 5);
        Assert.assertEquals(evaluate(new String[]{"2", "3", "-"}), -1);
        Assert.assertEquals(evaluate(new String[]{"3", "2", "-"}), 1);
        Assert.assertEquals(evaluate(new String[]{"3", "2", "*"}), 6);
        Assert.assertEquals(evaluate(new String[]{"3", "2", "/"}), 1);
    }

    public static int evaluate(String[] expression) {
        Stack<String> stack = new Stack<>();
        String operator = "+-*/";

        for (String s : expression) {
            //if it's not operator, push the number to stack
            if (!operator.contains(s)) {
                stack.push(s);
            } else {
                // when there is operator, pop two of them
                int x = Integer.parseInt(stack.pop());
                int y = Integer.parseInt(stack.pop());

                int index = operator.indexOf(s);
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
                    default:
                        break;
                }
            }
        }
        return Integer.parseInt(stack.pop());

    }
}
