package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kewang on 12/26/15.
 */
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

 */
public class MergeTwoLinkedList {
    static int counter = 0;

    public static void main(String[] args) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode leftHead = left;
        ListNode rightHead = right;
        int min = 0;
        int max = 10;
        for (int i = min; i < max; i++) {
            int random = ThreadLocalRandom.current().nextInt(min, max);

            if (i % 2 == 0) {
                ListNode temp = new ListNode(random);
                left.next = temp;
                left = left.next;
            } else {
                ListNode temp = new ListNode(random);
                right.next = temp;
                right = right.next;
            }
            //            System.out.println(" creation ");
            System.out.println(left.getVal() + " <=left and right=> " + right.getVal());
            counter++;
        }


        //    MergeTwoSortedList rd = new MergeTwoSortedList();

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
        counter = 0;

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
        System.out.println(" counter " + counter);

        return fakeNode;
    }
}
