package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class ReverseLinkedList {

    public Node reverseApproach1(Node head) {
        Node prev = null;
        Node curr = head;
        Node forward = null;

        if (head == null || head.nxt == null) {
            return head;
        }

        while (curr != null) {
            forward = curr.nxt;
            curr.nxt = prev;
            prev = curr;
            curr = forward;
        }
        return prev;// New Head
    }

    public void reverseApproach2(Node head, Node curr, Node prev) {

        // base case
        if (curr == null) {
            head = prev;
            return;
        }

        Node forward = curr.nxt;
        reverseApproach2(head, forward, curr);
        curr.nxt = prev;
    }
}
