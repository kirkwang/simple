package com.leetcode.easy;

import com.kirkwang.libary.ListNode;
import org.testng.Assert;

/*
https://leetcode.com/problems/linked-list-cycle/description/
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.


 */
public class HasCycle {
    public static void main(String[] args) {
        ListNode nameList = new ListNode(0);
        ListNode current = nameList;
        for (int i = 1; i < 10; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        HasCycle hc = new HasCycle();
        Assert.assertFalse(hc.hasCycle(nameList));
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println(" HasCycle at " + slow.getVal());
                return true;
            }
        }
        return false;
    }

}
