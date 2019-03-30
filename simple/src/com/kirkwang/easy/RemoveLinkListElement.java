package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;
//Remove all elements from a linked list of integers that have value val.
//
//        Example
//        Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
//        Return: 1 --> 2 --> 3 --> 4 --> 5

/**
 * Created by kewang on 3/3/16.
 */
public class RemoveLinkListElement {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        ListNode p = node;
        for (int i = 1; i <= 5; i++) {
            p.next = new ListNode(i);
            p = p.next;

        }

        ListNode p1 = node;
        removeLinkListElement(p1, 2);

        while (p1 != null) {
            System.out.println(p1.getVal());
            p1 = p1.next;
        }

    }

    public static ListNode removeLinkListElement(ListNode head, int val) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode p1 = newNode;
        ListNode p2 = head;
        while (p2 != null) {
            if (p2.val == val) {
                p1.next = p2.next;
                p2 = p2.next;
                continue;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return newNode.next;
    }

}
