package linkedlist.singlylinkedlist.questions;

import java.util.HashMap;

import linkedlist.singlylinkedlist.Node;

public class DetectAndRemoveLoop {

    public boolean detectLoop(Node head) {
        if (head == null) {
            return false;
        }

        HashMap<Node, Boolean> visted = new HashMap<>();
        Node temp = head;

        while (temp != null) {
            if (visted.getOrDefault(temp, false) == true) {
                System.out.println("Loop Present On Element " + temp.data);
                return true;
            }
            visted.put(temp, true);
            temp = temp.nxt;
        }
        return false;
    }
}
