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

    public RandNode cloneListApproach2(RandNode head) {

        // step 1: Craete a clone List
        RandNode cloneHead = null;
        RandNode temp = head;

        while (temp != null) {
            cloneHead = insertAtTail(cloneHead, temp.data);
            temp = temp.nxt;
        }

        // step 2: add clone nodes in between Original list
        RandNode origionalNode = head;
        RandNode cloneNode = cloneHead;

        while (origionalNode != null && cloneNode != null) {
            RandNode next = origionalNode.nxt;
            origionalNode.nxt = cloneNode;
            origionalNode = next;

            next = cloneNode.nxt;
            cloneNode.nxt = origionalNode;
            cloneNode = next;
        }
        // step 3: random pointer copy
        temp = head;
        while (temp != null) {
            if (temp.nxt != null) {
                if (temp.random != null) {
                    temp.nxt.random = temp.random.nxt;
                } else {
                    temp.nxt = temp.random;
                }
            }
            temp = temp.nxt.nxt;
        }
        // step 4: revert changes done in step 2
        origionalNode = head;
        cloneNode = cloneHead;

        while (origionalNode != null && cloneNode != null) {
            origionalNode.nxt = cloneNode.nxt;
            origionalNode = origionalNode.nxt;

            if (origionalNode != null) {
                cloneNode.nxt = origionalNode.nxt;
            }
            cloneNode = cloneNode.nxt;
        }

        // step 5: return ans
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