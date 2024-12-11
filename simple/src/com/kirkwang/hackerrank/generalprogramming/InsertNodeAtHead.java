package com.kirkwang.hackerrank.generalprogramming;

public class InsertNodeAtHead {


    int data;
    SinglyLinkedListNode next;


    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode t = llist;
        while (t.next != null) {
            t = t.next;
        }
        t.next = new SinglyLinkedListNode(data);

        return llist;
    }

    public static void main(String... args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(16);
        head.next = new SinglyLinkedListNode(13);

        insertNodeAtHead(head, 12);
        while (head.next != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

}
