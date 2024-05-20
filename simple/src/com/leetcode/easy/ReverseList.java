package com.leetcode.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 1/5/16.
 * <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseList {

    public static void main(String[] args) {

        ListNode nameList = new ListNode(0);
        ListNode current = nameList;
        for (int i = 1; i <= 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = reverseList(nameList);

        while (result != null) {
            System.out.println("This is the result " + result.getVal());
            result = result.next;
        }

    }


    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = pre;  //reverse, point to back
            pre = current;
            current = next;
        }
        return pre;
    }

}
