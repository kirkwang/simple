package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
        //[1,1,2,3,3]
        DeleteDuplicates dd = new DeleteDuplicates();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(3);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        dd.DeletDuplicates(one);
        ListNode current = one;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    public ListNode DeletDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head.next;
        ListNode pre = head;
        while (current != null) {
            if (current.getVal() == pre.getVal()) {
                pre.next = current.next;
            } else {
                pre = pre.next;
            }
            current = current.next;
        }
        return head;
    }
}
