package com.leetcode;

import com.kirkwang.libary.ListNode;

public class FindMiddleLinkedList {
    // Method to find the middle node of a linked list
    /*https://leetcode.com/problems/middle-of-the-linked-list/description/
    Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
     */

    public static void main(String[] args) {
        ListNode nameList = new ListNode(1);
        ListNode current = nameList;
        for (int i = 2; i <= 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        FindMiddleLinkedList hc = new FindMiddleLinkedList();

        ListNode temp = hc.findMiddleNode(nameList);

        while (temp != null) {
            System.out.println(temp.getVal());
            temp = temp.next;
        }
    }

    public ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

}
