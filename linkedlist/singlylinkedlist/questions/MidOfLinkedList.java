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
}
