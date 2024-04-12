package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 1/5/16.
 * This function will delete the duplicated node in sorted Linked list.
 */
public class DeletDuplicates {

    public ListNode DeletDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next; //set P to 2nd node
        ListNode pre = head;

        while (next != null) {
            if (pre.val == next.val) {
                pre.next = next.next; // It by-pass P
                next = next.next;
            } else {
                pre = next;
                next = next.next;
            }
        }
        return head;
    }
}
