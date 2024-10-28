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
        int starter = 0;
        ListNode even = new ListNode(starter);
        ListNode odd = new ListNode(starter);
        ListNode evenHead = even;
        ListNode oddHead = odd;

        int max = 10;
        for (int i = 1; i < max; i++) {

            if (i % 2 == 0) {
                even.next = new ListNode(i);
                even = even.next;
            } else {
                odd.next = new ListNode(i);
                odd = odd.next;
            }
            System.out.println(even.getVal() + " <=even and odd=> " + odd.getVal());

        }
        odd.next = new ListNode(max);


        MergeTwoLinkedList rd = new MergeTwoLinkedList();
        ListNode merged = rd.mergeTwoLinkedList(evenHead, oddHead, null);


        while (merged != null) {
            System.out.print(merged.getVal() + " ");
            merged = merged.next;
        }
    }

    public ListNode mergeTwoLinkedList(ListNode list1, ListNode list2, ListNode stopper) {
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
