package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class MergeSortInLinkedList {

    public Node mergeSortInLinkedList(Node head) {

        // base case
        if (head == null || head.nxt == null) {
            return head;
        }

        // Find mid
        Node mid = findMid(head);

        // Break List Into two halves
        Node left = head;
        Node right = mid.nxt;
        mid.nxt = null;

        // Solve Recursively
        left = mergeSortInLinkedList(left);
        right = mergeSortInLinkedList(right);

        // merge both left and right halves
        Node res = merge(left, right);

        return res;
    }

    Node findMid(Node head) {
        Node slow = head;
        Node fast = head.nxt;

        while (fast != null && fast.nxt != null) {
            slow = slow.nxt;
            fast = fast.nxt.nxt;
        }
        return slow;
    }

    Node merge(Node left, Node right) {

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        Node ans = new Node(-1);
        Node temp = ans;
        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.nxt = left;
                temp = left;
                left = left.nxt;
            } else {
                temp.nxt = right;
                temp = right;
                right = right.nxt;
            }
        }

        while (left != null) {
            temp.nxt = left;
            temp = left;
            left = left.nxt;
        }

        while (right != null) {
            temp.nxt = right;
            temp = right;
            right = right.nxt;
        }

        return ans.nxt; // nxt to remove dummy
    }
}
