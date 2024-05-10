package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 1/5/16.
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoSortedList {

    ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        ListNode fakeNode = new ListNode(0);
        ListNode p = fakeNode;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }

        return fakeNode.next;

    }
}
