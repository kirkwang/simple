package com.leetcode.easy;


import org.testng.Assert;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/description/">...</a>
 * Input: head = [1,2,2,1]
 * Output: true
 */
public class IsPalindrome_linklist {
    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        ListNode current = list;
        for (int i = 1; i < 2; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        for (int i = 2; i >= 0; i--) {
            current.next = new ListNode(i);
            current = current.next;
        }

        Assert.assertTrue(isPalindrome(list));
    }

    private static void printList(ListNode target) {
        while (target != null) {
            System.out.print(target.val + " ");
            target = target.next;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode middle;
        middle = findMiddle(head);
        ListNode reversed = reverseList(middle);
        // printList( reversed);
        while (head.next != null) {
            if (head.val == reversed.val) {
                head = head.next;
                reversed = reversed.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;

        }
        return pre;
    }

    public static ListNode findMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
