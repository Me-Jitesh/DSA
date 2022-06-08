package linkedlist.singlylinkedlist.questions;

import java.util.HashMap;
import java.util.Map;

import linkedlist.singlylinkedlist.RandNode;

public class CloneListWithRandomPointer {

    public RandNode cloneListApproach1(RandNode head) {

        // Create Clone of List
        RandNode cloneHead = null;
        RandNode temp = head;

        while (temp != null) {
            // System.out.println("Debugger"+temp);
            cloneHead = insertAtTail(cloneHead, temp.data);
            temp = temp.nxt;
        }

        // Crate Map
        Map<RandNode, RandNode> oldToNewNode = new HashMap<>();
        RandNode origionalNode = head;
        RandNode cloneNode = cloneHead;
        while (origionalNode != null) {
            oldToNewNode.put(origionalNode, cloneNode);
            origionalNode = origionalNode.nxt;
            cloneNode = cloneNode.nxt;
        }
        // Arrange random Pointers
        origionalNode = head;
        cloneNode = cloneHead;
        while (origionalNode != null) {
            cloneNode.random = oldToNewNode.get(origionalNode.random);
            origionalNode = origionalNode.nxt;
            cloneNode = cloneNode.nxt;
        }
        return cloneHead;
    }

    RandNode insertAtTail(RandNode head, int data) {

        if (head == null) {
            head = new RandNode(data);
            return head;
        }

        RandNode curr = head;
        RandNode newNode = new RandNode(data);
        while (curr.nxt != null) {
            curr = curr.nxt;
        }
        curr.nxt = newNode;
        return head;
    }
}