package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class RemoveDuplicates {

    public Node removeDuplicatesFromSortedList(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {
            if ((curr.nxt != null) && curr.data == curr.nxt.data) {
                Node temp = curr.nxt.nxt;
                curr.nxt.nxt = null;
                curr.nxt = temp;
            } else {
                curr = curr.nxt;
            }
        }
        return head;
    }
}
