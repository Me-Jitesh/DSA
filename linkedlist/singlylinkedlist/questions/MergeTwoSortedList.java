package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class MergeTwoSortedList {

    public Node mergeTwoList(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        if (first.data <= second.data) {
            return solve(first, second);
        } else {
            return solve(second, first);
        }
    }

    private Node solve(Node second, Node first) {

        // if only one element is present in first list
        if ((first.nxt == null)) {
            first.nxt = second;
            return first;
        }
        
        Node curr1 = first;
        Node nxt1 = curr1.nxt;
        Node curr2 = second;
        Node nxt2 = curr2.nxt;

        while (nxt1 != null && curr2 != null) {
            if ((curr2.data >= curr1.data) && (curr2.data <= nxt1.data)) {
                // add node in between the first list
                curr1.nxt = curr2;
                nxt2 = curr2.nxt;
                curr2.nxt = nxt1;

                // Update Pointers
                curr1 = curr2;
                curr2 = nxt2;
            } else {
                // Move Ahead to curr1 & nxt1
                curr1 = nxt1;
                nxt1 = nxt1.nxt;

                if (nxt1 == null) {
                    curr1.nxt = curr2;
                    return first;
                }
            }
        }
        return first;
    }
}
