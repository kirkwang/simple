package com.leetcode.easy;

import com.kirkwang.libary.ListNode;
//Remove all elements from a linked list of integers that have value val.
//https://leetcode.com/problems/remove-linked-list-elements/
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
        removeElements(node, 2);

        while (node != null) {
            System.out.println(node.getVal());
            node = node.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode tempNode = new ListNode(-1);
        tempNode.next = head;

        ListNode previous = tempNode;
        ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
                current = current.next;
                continue;
            }
            previous = previous.next;
            current = current.next;
        }
        return tempNode.next;
    }

}
