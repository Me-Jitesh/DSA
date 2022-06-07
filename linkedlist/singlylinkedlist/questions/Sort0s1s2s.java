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
}
