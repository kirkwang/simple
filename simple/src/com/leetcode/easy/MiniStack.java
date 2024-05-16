package com.leetcode.easy;

import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();

    public static void main(String[] args) {
        MinStack mini = new MinStack();
        for (int i = 0; i < 10; i++) {

            System.out.println("hello world " + i);
            mini.push(i);
        }
        for (int i = 0; i < mini.minStack.size(); i++) {
            System.out.println(mini.minStack.get(i));
            System.out.println(mini.stack.get(i));
        }

    }

    public void push(int x) {
        stack.add(x);
        if (minStack.isEmpty() || minStack.get(minStack.size() - 1) >= x) {
            minStack.add(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int elem = stack.remove(stack.size() - 1);
        if (!minStack.isEmpty() && elem == minStack.get(minStack.size() - 1)) {
            minStack.remove(minStack.size() - 1);
        }

    }

    public int top() {
        if (!stack.isEmpty())
            return stack.get(stack.size() - 1);
        return 0;
    }

    public int getMin() {
        if (!minStack.isEmpty())
            return minStack.get(minStack.size() - 1);
        return 0;
    }

}