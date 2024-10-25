package com.leetcode.easy;

import com.kirkwang.libary.ListNode;
/*
  https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/47036747/
  Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
  If the two linked lists have no intersection at all, return null.
 */

/**
 * Created by kewang on 3/3/16.
 */
public class GetIntersectionNode {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode current = list1;
        for (int i = 1; i <= 10; i += 2) {
            current.next = new ListNode(i);
            current = current.next;
        }

        ListNode list2 = new ListNode(0);
        current = list2;
        for (int i = 2; i <= 10; i += 2) {
            current.next = new ListNode(i);
            current = current.next;
        }


        list1.next.next = list2.next.next;  // joined on the 3rd node

        System.out.println(" p1 nodes are ");
        ListNode p1 = list1;
        while (p1 != null) {
            System.out.print(p1.getVal() + " ");
            p1 = p1.next;
        }


        System.out.println(" p2 nodes are ");
        ListNode p2 = list2;
        while (p2 != null) {
            System.out.print(p2.getVal() + " ");
            p2 = p2.next;
        }

        GetIntersectionNode gsn = new GetIntersectionNode();
        ListNode result = gsn.getIntersectionNode(list1, list2);

        System.out.println("the result is ");
        while (result != null) {
            System.out.print(result.getVal() + " ");
            result = result.next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }


}
