package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 12/26/15.
 */
/*
https://leetcode.com/problems/merge-two-sorted-lists/description/
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoLinkedList {


    public static void main(String[] args) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode leftHead = left;
        ListNode rightHead = right;

        int max = 10;
        for (int i = 1; i < max; i++) {

            if (i % 2 == 0) {
                left.next = new ListNode(i);
                left = left.next;
            } else {
                right.next = new ListNode(i);
                right = right.next;
            }
            System.out.println(left.getVal() + " <=left and right=> " + right.getVal());

        }
        right.next = new ListNode(11);


        MergeTwoLinkedList rd = new MergeTwoLinkedList();
        ListNode merged = rd.mergeTwoLinkedList(leftHead, rightHead);

/*

        MergeTwoLinkedList rd = new MergeTwoLinkedList();
        ListNode merged = rd.mergeTwoLists(leftHead, rightHead);
*/

        while (merged != null) {
            System.out.print(merged.getVal() + " ");
            merged = merged.next;
        }
    }

    public ListNode mergeTwoLinkedList(ListNode left, ListNode right) {
        ListNode fakeNode = new ListNode(0);
        ListNode ptr = fakeNode;
        while (left != null) {
            if (left.getVal() <= right.getVal()) {
                ptr.next = left;
                left = left.next;
            } else {
                ptr.next = right;
                right = right.next;
            }
            ptr = ptr.next;

        }
        if (left == null) {
            ptr.next = right;
        }
        if (right == null) {
            ptr.next = left;
        }
        return fakeNode.next;
    }

    public ListNode mergeTwoLists(ListNode currA, ListNode currB) {
        if (currA == null) {
            return currB;
        } else if (currB == null) {
            return currA;
        }

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (currA != null && currB != null) {
            if (currA.val < currB.val) {
                p.next = currA;
                currA = currA.next;
            } else {
                p.next = currB;
                currB = currB.next;
            }
            p = p.next;
        }

        // attach remaining elements
        p.next = (currA == null) ? currB : currA;

        return dummy.next;
    }
}
