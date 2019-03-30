package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 1/5/16.
 * what if the node is the last one
 */
public class DeleteNodeInALinkedList {
    public void deleteNodeInaLinedList(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
