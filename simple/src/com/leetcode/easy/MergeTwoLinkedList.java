package com.leetcode.easy;

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


        while (merged != null) {
            System.out.print(merged.getVal() + " ");
            merged = merged.next;
        }
    }

    public ListNode mergeTwoLinkedList(ListNode list1, ListNode list2) {
        ListNode fakeNode = new ListNode(0);
        ListNode ptr = fakeNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;

        }
        if (list1 == null) {
            ptr.next = list2;
        }
        if (list2 == null) {
            ptr.next = list1;
        }
        return fakeNode.next;
    }


}
