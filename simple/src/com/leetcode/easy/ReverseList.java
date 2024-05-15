package com.leetcode.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 1/5/16.
 * <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseList {

    public static void main(String[] args) {
        ReverseList rl = new ReverseList();

        ListNode nameList = new ListNode(1);
        ListNode current = nameList;
        for (int i = 2; i <= 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = rl.reverseList(nameList);

        while (result != null) {
            System.out.println("This is the result " + result.getVal());
            result = result.next;
        }

    }


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

}
