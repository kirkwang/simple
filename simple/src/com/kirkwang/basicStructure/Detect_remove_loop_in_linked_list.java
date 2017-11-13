package com.kirkwang.basicStructure;

/**
 * Created by kewang on 2/27/16.
 */
public class Detect_remove_loop_in_linked_list {
    // Java program to detect and remove loop in linked list


    static Node head;

    // Driver program to test above functions
    public static void main(String[] args) {
        Detect_remove_loop_in_linked_list list = new Detect_remove_loop_in_linked_list();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        Detect_remove_loop_in_linked_list list_1 = new Detect_remove_loop_in_linked_list();
        list_1.head = new Node(51);
        list_1.head.next = new Node(21);
        list_1.head.next.next = new Node(11);
        list_1.head.next.next.next = new Node(5);
        list_1.head.next.next.next.next = new Node(11);

        list = list_1;
        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }

    // Function that detects loop in the list
    int detectAndRemoveLoop(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }

    // Function to remove loop
    void removeLoop(Node loop, Node curr) {
        Node ptr1 = null, ptr2 = null;
        /* Set a pointer to the beging of the Linked List and
        move it one by one to find the first node which is
		part of the Linked List */
        ptr1 = curr;
        while (true) {

			/* Now start a pointer from loop_node and check if it ever
            reaches ptr2 */
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }

			/* If ptr2 reahced ptr1 then there is a loop. So break the
			loop */
            if (ptr2.next == ptr1) {
                break;
            }

			/* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            ptr1 = ptr1.next;
        }


		/* After the end of loop ptr2 is the last node of the loop. So
		make next of ptr2 as NULL */
        ptr2.next = null;
    }

    // Function to print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}

// This code has been contributed by Mayank Jaiswal

