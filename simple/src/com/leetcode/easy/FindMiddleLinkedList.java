package com.leetcode.easy;

import com.kirkwang.libary.ListNode;
import org.testng.Assert;

public class FindMiddleLinkedList {
    // Method to find the middle node of a linked list
    /*
    https://leetcode.com/problems/middle-of-the-linked-list/description/
    Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
     */

    public static void main(String[] args) {
        int index = 1;
        ListNode nameList = new ListNode(index);

        ListNode current = nameList;
        // init 6 nodes and values
        for (int i = index; i <= 5; i++) {
            current.next = new ListNode(i + 1);
            current = current.next;
        }

        FindMiddleLinkedList hc = new FindMiddleLinkedList();
        ListNode results = hc.findMiddleNode(nameList);
        StringBuilder sb = new StringBuilder();
        while (results != null) {
            sb.append(results.getVal());
            results = results.next;
        }
        Assert.assertEquals(sb.toString(), "456");
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
