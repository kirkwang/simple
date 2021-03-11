package com.kirkwang.easy;

public class HelloWorldMessage {

    public static void main(String[] args) {
        String message = "Hello";
        printMessage(message);
        message += "World!";
        printMessage(message);
    }

    public static void printMessage(String input) {
        System.out.print(input.substring(1, 5) + input.substring(5, 1));

    }
}
