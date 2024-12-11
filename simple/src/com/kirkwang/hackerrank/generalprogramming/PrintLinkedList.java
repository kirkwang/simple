package com.kirkwang.hackerrank.generalprogramming;


public class PrintLinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String... args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);

        head.next = new SinglyLinkedListNode(13);
        printLinkedList(head);
    }


}
