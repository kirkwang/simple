package com.leetcode.easy;

/**
 * Created by kewang on 1/5/16.
 * what if the node is the last one
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/description/">...</a>
 * There is a singly-linked list head and we want to delete a node node in it.
 *
 * You are given the node to be deleted node. You will not be given access to the first node of head.
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 */
public class DeleteNodeInALinkedList {
    ListNode head;

    public DeleteNodeInALinkedList() {
        head = new ListNode(0);
        ListNode current = head;

        for (int i = 1; i < 10; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList deleteNode = new DeleteNodeInALinkedList();
        ListNode result = deleteNode.deleteNodeInaLinedList(new ListNode(1));
        printList(result);

    }

    private static void printList(ListNode target) {
        while (target != null) {
            System.out.print(target.val + " ");
            target = target.next;
        }
    }

    public ListNode deleteNodeInaLinedList(ListNode node) {

        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode pre = temp;
        while (temp != null) {
            if (node.val == temp.val) {
                pre.next = temp.next;
            }
            pre = temp;
            temp = temp.next;
        }

        // node.val = node.next.val;
        // node.next = node.next.next;

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
