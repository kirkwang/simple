package com.leetcode.easy;

import com.kirkwang.libary.ListNode;

// it is not working
public class ReorderList {
    public static void main(String[] args) {
        ListNode left = new ListNode(0);

        ListNode leftHead = left;

        int max = 10;
        for (int i = 1; i < max; i++) {
            left.next = new ListNode(i);
            left = left.next;
        }

        FindMiddleLinkedList fml = new FindMiddleLinkedList();
        ListNode result = fml.findMiddleNode(leftHead);


        ListNode reversedList = ReverseList.reverseList(result);


        MergeTwoLinkedList rd = new MergeTwoLinkedList();
        HasCycle hc = new HasCycle();
        Boolean flag = hc.hasCycle(leftHead);
        System.out.println(flag);


        ListNode merged = rd.mergeTwoLinkedList(leftHead, reversedList, null);

        flag = hc.hasCycle(merged);
        System.out.println(flag);
        printList(merged);


    }

    private static void printList(ListNode target) {
        while (target != null) {
            System.out.print(target.getVal() + " ");
            target = target.next;
        }
    }
}
