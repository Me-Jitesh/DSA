package linkedlist.singlylinkedlist.questions;

import linkedlist.singlylinkedlist.Node;

public class PalindromeList {

    public boolean isPalindrome(Node sllHead) {

        if (sllHead == null || sllHead.nxt == null) {
            System.out.println("Palindrome Hai");
            return true;
        }

        // Find mid
        Node mid = new MidOfLinkedList().midOfLinkedListApproach2(sllHead);

        // Reverse List After Middle
        Node temp = mid.nxt;
        // Concatenate Both Half
        mid.nxt = new ReverseLinkedList().reverseApproach3(temp);

        Node head1 = sllHead;
        Node head2 = mid.nxt;

        while (head2 != null) {
            if (head1.data != head2.data) {
                System.err.println("Palindrome Nahi Hai");
                return false;
            }

            head1 = head1.nxt;
            head2 = head2.nxt;
        }
        // Rebuild the list like previous one (Optional)
        temp = mid.nxt;
        mid.nxt = new ReverseLinkedList().reverseApproach3(temp);
        System.out.println("Palindrome Hai");
        return true;
    }
}
