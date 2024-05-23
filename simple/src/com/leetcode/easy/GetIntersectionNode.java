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
        ListNode node1 = new ListNode(0);
        ListNode p = node1;
        for (int i = 1; i <= 10; i += 2) {
            p.next = new ListNode(i);
            p = p.next;
        }


        ListNode node2 = new ListNode(0);
        p = node2;
        for (int i = 2; i <= 10; i += 2) {
            p.next = new ListNode(i);
            p = p.next;
        }
        node1.next.next = node2.next.next;  // joined at 3rd node

        ListNode p1 = node1;
        while (p1 != null) {
            System.out.print(p1.getVal() + " ");
            p1 = p1.next;
        }
        System.out.println(" p2 before finding");
        ListNode p2 = node2;
        while (p2 != null) {
            System.out.print(p2.getVal() + " ");
            p2 = p2.next;
        }

        GetIntersectionNode gsn = new GetIntersectionNode();
        p2 = gsn.getIntersectionNode(node1, node2);
        System.out.println(" p2 after finding");

        while (p2 != null) {
            System.out.print(p2.getVal() + " ");
            p2 = p2.next;
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
