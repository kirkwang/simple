package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 12/26/15.
 */
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

 */
public class MergeTwoLinkedList {
    public static void main(String[] args) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode leftHead = left;
        ListNode rightHead = right;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                ListNode temp = new ListNode(i);
                left.next = temp;
                left = left.next;
            } else {
                ListNode temp = new ListNode(i);
                right.next = temp;
                right = right.next;
            }
            //   System.out.println(" creation ");
          //  System.out.println(left.getVal() + " <=left and right=> " + right.getVal());

        }
     //   System.out.println(leftHead.next.getVal() + " <=leftHead and rightHead=> " + rightHead.next.getVal());

        MergeTwoLinkedList rd = new MergeTwoLinkedList();
        ListNode merged = rd.mergeTwoLinkedList(leftHead, rightHead);
        while (merged != null) {
            System.out.print(merged.getVal() + " ");
            merged = merged.next;
        }

    }

    public ListNode mergeTwoLinkedList(ListNode left, ListNode right) {
        ListNode fakeNode = new ListNode(0);
        ListNode ptr = fakeNode;
        while (left != null && right != null) {
//            System.out.println(left.getVal() + " <-left and right-> " + right.getVal());

            if (left.getVal() < right.getVal()) {
                ptr.next = left;
                ptr = left;
                left = left.next;
            } else {
                ptr.next = right;
                ptr = right;
                right = right.next;
            }
        }
        return fakeNode;
    }
}
