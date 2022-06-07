package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class ReverseInKGroup {
    public Node reverseInKGroup(Node sllHead, int k) {

        if (sllHead == null) {
            return null;
        }

        // Reverse First K Nodes
        Node curr = sllHead;
        Node prev = null;
        Node forward = null;
        int cnt = 0;

        while (curr != null && cnt < k) {
            forward = curr.nxt;
            curr.nxt = prev;
            prev = curr;
            curr = forward;
            cnt++;
        }

        if (forward != null) {
            sllHead.nxt = reverseInKGroup(forward, k);
        }
        // Return New Head
        return prev;
    }
}
