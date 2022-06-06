package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class MidOfLinkedList {

    public void midOfLinkedListApproach1(Node sllHead) {

        // find length
        int counter = 0;
        Node curr = sllHead;
        while (curr != null) {
            counter++;
            curr = curr.nxt;
        }
        int mid = (counter / 2) + 1;
        System.out.println("Middle Of List with " + counter + " Element Is : " + mid);
    }

    public Node midOfLinkedListApproach2(Node sllHead) {

        if (sllHead == null || sllHead.nxt == null) {
            return sllHead;
        }

        if (sllHead.nxt.nxt == null) {
            return sllHead.nxt;
        }

        Node slow = sllHead;
        Node fast = sllHead.nxt;
        while (fast != null) {
            fast = fast.nxt;
            if (fast != null) {
                fast = fast.nxt;
            }
            slow = slow.nxt;
        }
        return slow;
    }
}
