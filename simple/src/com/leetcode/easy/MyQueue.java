package com.leetcode.easy;
/*
  https://leetcode.com/problems/implement-queue-using-stacks/submissions/1263312563/
  Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
  Input
  ["MyQueue", "push", "push", "peek", "pop", "empty"]
  [[], [1], [2], [], [], []]
  Output
  [null, null, null, 1, 1, false]
  <p>
  Explanation
  MyQueue myQueue = new MyQueue();
  myQueue.push(1); // queue is: [1]
  myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
  myQueue.peek(); // return 1
  myQueue.pop(); // return 1, queue is [2]
  myQueue.empty(); // return false
 */

import org.testng.Assert;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> one;
    Stack<Integer> two;

    public MyQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);

        Assert.assertEquals(obj.pop(), 1);
        Assert.assertFalse(obj.empty());
        Assert.assertEquals(obj.pop(), 2);
        Assert.assertTrue(obj.empty());
        Assert.assertEquals(obj.peek(), 0);

    }

    public void push(int x) {
        one.push(x);
    }

    public int pop() {
        if (one.empty()) {
            return 0;
        }
        while (!one.empty()) {
            two.push(one.pop());
        }  // shift/pop into one
        int result = two.pop();
        while (!two.empty()) {
            // after pop , put everything back into one
            one.push(two.pop());
        }
        return result;
    }

    public int peek() {
        if (one.empty()) {
            return 0;
        }
        while (!one.empty()) {
            two.push(one.pop());
        }
        int result = two.peek();
        while (!two.empty()) {
            one.push(two.pop());
        }
        return result;
    }

    public boolean empty() {
        return one.empty();
    }
}
