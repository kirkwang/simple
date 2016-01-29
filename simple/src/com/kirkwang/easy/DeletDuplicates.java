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
        ListNode p = head.next; //set P to 2nd node
        ListNode pre = head;

        while (p != null) {
            if (pre.val == p.val) {
                pre.next = p.next; // It by-pass P
                p = p.next;
            } else {
                pre = p;
                p = p.next;
            }
        }
        return head;
    }
}
