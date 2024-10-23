package com.leetcode.easy;

import com.kirkwang.libary.ListNode;
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

/**
 * Created by kewang on 1/5/16.
 * This function will delete the duplicated node in sorted Linked list.
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/
public class DeleteDuplicates {

    public static void main(String[] args) {


        ListNode head = new ListNode(0);
        ListNode current = head;
        //[0,0,1,2,3,4]
        for (int i = 0; i < 5; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        DeleteDuplicates.deleteDuplicates(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static void deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head.next;
        ListNode pre = head;
        while (current != null) {
            if (pre.getVal() == current.getVal()) {
                pre.next = current.next;
            } else {
                pre = pre.next;
            }
            current = current.next;
        }
    }
}
