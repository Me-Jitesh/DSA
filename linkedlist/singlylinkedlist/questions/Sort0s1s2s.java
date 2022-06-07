package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class Sort0s1s2s {

    public Node sortApproach1(Node head) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zeroCount++;
            } else if (temp.data == 1) {
                oneCount++;
            } else if (temp.data == 2) {
                twoCount++;
            }
            temp = temp.nxt;
        }

        temp = head;
        while (temp != null) {
            if (zeroCount != 0) {
                temp.data = 0;
                zeroCount--;
            } else if (oneCount != 0) {
                temp.data = 1;
                oneCount--;
            } else if (twoCount != 0) {
                temp.data = 2;
                twoCount--;
            }
            temp = temp.nxt;
        }
        return head;
    }

    public Node sortApproach2(Node head) {

        // Create Three Separate List
        Node zeroHead = new Node(-1); // -1 is a Dummy Value to ease the merger
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node curr = head;

        while (curr != null) {
            int val = curr.data;
            if (val == 0) {
                zeroTail = insertAtTail(zeroTail, curr);
            } else if (val == 1) {
                oneTail = insertAtTail(oneTail, curr);
            } else if (val == 2) {
                twoTail = insertAtTail(twoTail, curr);
            }
            curr = curr.nxt;
        }

        // merge sublist

        if (oneHead.nxt != null) { // mean 1 list is not empty
            zeroTail.nxt = oneHead.nxt; // nxt to bypass the dummy
        } else {
            zeroTail.nxt = twoHead.nxt;
        }

        oneTail.nxt = twoHead.nxt;
        twoTail.nxt = null;

        // Setup Head
        head = zeroHead.nxt;

        // Delete Dummy Nodes
        zeroHead.nxt = null;
        oneHead.nxt = null;
        twoHead.nxt = null;

        return head;
    }

    private Node insertAtTail(Node zeroTail, Node curr) {
        zeroTail.nxt = curr;
        zeroTail = curr;
        return zeroTail;
    }
}
