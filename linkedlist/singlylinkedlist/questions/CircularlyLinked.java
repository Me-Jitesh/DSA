package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class CircularlyLinked {

    public boolean isCircularlyLinkedApproach1(Node head) {
        if (head == null) {
            return true;
        }

        Node temp = head.nxt;

        while (temp != null && temp != head) {
            temp = temp.nxt;
        }
        if (temp == head) {
            return true;
        }
        return false;
    }
}
