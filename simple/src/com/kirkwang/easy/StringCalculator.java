/*
 * 3/31/19 3:22 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.kirkwang.easy;

import java.util.Stack;

class StringCalculator {

    public static void main(String[] args) {
        String input = "5+2-4";
        StringCalculator sc = new StringCalculator();
        sc.StringCalculator(input);
        input = "5+2*4";
        sc.StringTokenPolishNotation(input.split(""));
    }


    int StringCalculator(String input) {
        String sign = null;
        if (!Character.isDigit(input.charAt(0))) {
            sign = String.valueOf(input.charAt(0));
            input = input.substring(1);
        } else {
            sign = "+";
        }

        String[] operator = input.split("[0-9]+");
        String[] operands = input.split("[+-]");

        int aggrateor = Integer.parseInt(operands[0]);

        for (int i = 1; i < operands.length; i++) {
            if (operator[i].equals("+")) {
                aggrateor += Integer.parseInt(operands[i]);
            } else {
                aggrateor -= Integer.parseInt(operands[i]);
            }
        }

        if (sign.equals("-")) {
            aggrateor -= 2 * Integer.valueOf(operands[0]);
        }
        System.out.println("aggrateor " + aggrateor);
        return aggrateor;
    }

    int StringTokenPolishNotation(String[] tokens) {
        String operators = "+-*/";
        Stack operatorStack = new Stack();
        Stack operatandStack = new Stack();

        for (int i = 0; i < tokens.length; i++) {
            if (!operators.contains(tokens[i])) {
                operatandStack.push(tokens[i]);
            } else {
                operatorStack.push(tokens[i]);
            }
        }
        System.out.println("operatandStack size" + operatandStack.size());
        System.out.println("operatorStack size" + operatorStack.size());


        return 0;
    }

}