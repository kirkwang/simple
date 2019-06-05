package com.kirkwang.easy;

import com.kirkwang.libary.ListNode;

/**
 * Created by kewang on 1/5/16.
 */
public class ReverseList {

  public static void main(String[] args) {

    System.out.println("This is the result " + 0);

  }

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode p1 = head;
    ListNode p2 = head.next;
    head.next = null;

    while (p1 != null && p2 != null) {
      ListNode temp = p2.next;
      p2.next = p1;
      p1 = p2;
      if (temp != null) {
        p2 = temp;
      } else {
        break;
      }
    }
    return p2;
  }

  public ListNode reverseListRecursive(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode second = head.next;
    head.next = null;
    ListNode reversed = reverseListRecursive(second);
    reversed.next = head;
    return reversed;
  }
}
