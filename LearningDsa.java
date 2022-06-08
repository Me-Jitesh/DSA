import linkedlist.singlylinkedlist.GenericNode;
import linkedlist.singlylinkedlist.Node;
import linkedlist.singlylinkedlist.RandNode;
// import linkedlist.singlylinkedlist.questions.CloneListWithRandomPointer;
import linkedlist.singlylinkedlist.questions.MergeSortInLinkedList;
// import linkedlist.singlylinkedlist.questions.AddTwoNumbers;
// import linkedlist.singlylinkedlist.questions.MergeTwoSortedList;
// import linkedlist.singlylinkedlist.questions.PalindromeList;
// import linkedlist.singlylinkedlist.questions.CircularlyLinked;
// import linkedlist.singlylinkedlist.questions.DetectAndRemoveLoop;
// import linkedlist.singlylinkedlist.questions.RemoveDuplicates;
// import linkedlist.singlylinkedlist.questions.Sort0s1s2s;
// import linkedlist.singlylinkedlist.questions.MidOfLinkedList;
// import linkedlist.singlylinkedlist.questions.ReverseInKGroup;
// import linkedlist.singlylinkedlist.questions.ReverseLinkedList;
import linkedlist.circulerlinkedlist.CSLLNode;
import linkedlist.doublylinkedlist.DllNode;

public class LearningDsa {

    public static void main(String[] args) {

        // Singly Linked List
        Node sllHead = printSLLCreateNode();
        // printSLLTraverseNode(sllHead);
        // GenericNode<Integer> sllGHead = printSLLCreateGenericNode();
        // printSLLTraverseGNode(sllGHead);
        // Node sllNewHead = insertAtHead(sllHead, 50);
        // printSLLTraverseNode(sllNewHead);
        // Node sllNew = insertAtTail(sllHead, 50);
        // printSLLTraverseNode(sllNew);
        // Node sllNew = insertAtPosition(sllHead, 4, 50);
        // printSLLTraverseNode(sllNew);
        // Node sllNew = deleteAtPosition(sllHead, 3);
        // printSLLTraverseNode(sllNew);

        // Doubly Linked List
        // DllNode dllHead = printDLLCreateNode();
        // printDLLTraverseNode(dllHead);
        // System.out.println(printDllLength(dllHead));
        // dllHead = insertAtPositionDll(dllHead, 5, 50);
        // printDLLTraverseNode(dllHead);
        // dllHead = deleteAtPositionDll(dllHead, 4);
        // printDLLTraverseNode(dllHead);

        // Singly Circuler Linked List
        // CSLLNode cslltail = null;
        // cslltail = insertionAtCSLL(cslltail, 0, 10);
        // cslltail = insertionAtCSLL(cslltail, 10, 15);
        // cslltail = insertionAtCSLL(cslltail, 10, 18);
        // cslltail = insertionAtCSLL(cslltail, 15, 25);
        // csllNodeTraversal(cslltail);
        // deleteNode(cslltail, 25);

        // Questions
        // Node sllHead = printSLLCreateNode();
        // head = new ReverseLinkedList().reverseApproach1(head);
        // printSLLTraverseNode(head);
        // new ReverseLinkedList().reverseApproach2(head, head, null);
        // head = new ReverseLinkedList().reverseApproach3(head);
        // printSLLTraverseNode(head);

        // sllHead = insertAtTail(sllHead, 8);
        // sllHead = insertAtTail(sllHead, 5);
        // sllHead = insertAtHead(sllHead, 6);
        // new MidOfLinkedList().midOfLinkedListApproach1(sllHead);
        // Node mid = new MidOfLinkedList().midOfLinkedListApproach2(sllHead);
        // System.out.println("Value at Middle is : " + mid.data);

        // Node head = new ReverseInKGroup().reverseInKGroup(sllHead, 2);
        // printSLLTraverseNode(head);

        // System.out.println(new
        // CircularlyLinked().isCircularlyLinkedApproach1(sllHead));

        // System.out.println(new DetectAndRemoveLoop().detectLoop(sllHead));
        // System.out.println(new DetectAndRemoveLoop().detectLoopOpti(sllHead));
        // new DetectAndRemoveLoop().findStartingNode(sllHead);
        // new DetectAndRemoveLoop().removeLoop(sllHead);

        // sllHead = new RemoveDuplicates().removeDuplicatesFromSortedList(sllHead);

        // sllHead = new Sort0s1s2s().sortApproach1(sllHead);
        // sllHead = new Sort0s1s2s().sortApproach2(sllHead);

        // Node first = sllHead;
        // Node second = printSLLCreateNode();
        // Node head = new MergeTwoSortedList().mergeTwoList(first, second);
        // printSLLTraverseNode(head);

        // new PalindromeList().isPalindrome(sllHead);

        // Node sllHead2 = printSLLCreateNode();
        // Node sumList = new AddTwoNumbers().sum(sllHead, sllHead2);
        // printSLLTraverseNode(sumList);

        // RandNode head = createRandNode();
        // randNodeTraverse(head);
        // // head = new CloneListWithRandomPointer().cloneListApproach1(head);
        // head = new CloneListWithRandomPointer().cloneListApproach2(head);
        // randNodeTraverse(head);

        Node head = new MergeSortInLinkedList().mergeSortInLinkedList(sllHead);
        printSLLTraverseNode(head);
    }

    static void randNodeTraverse(RandNode head) {
        if (head == null) {
            System.out.println("List Empty Hai Bhai");
        }
        RandNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            System.out.print(curr.random.data + " R ");
            curr = curr.nxt;
        }
        System.out.println();
    }

    static RandNode createRandNode() {
        RandNode r1 = new RandNode(1);
        RandNode r2 = new RandNode(2);
        RandNode r3 = new RandNode(3);
        RandNode r4 = new RandNode(4);
        RandNode r5 = new RandNode(5);

        r1.nxt = r2;
        r1.random = r3;
        r2.nxt = r3;
        r2.random = r1;
        r3.nxt = r4;
        r3.random = r5;
        r4.nxt = r5;
        r4.random = r3;
        r5.random = r2;

        return r1;
    }

    static void deleteNode(CSLLNode cslltail, int data) {
        if (cslltail == null) {
            System.out.println(" List is empty");
            return;
        } else {
            // non-empty
            // assuming that data is present in the Linked List
            CSLLNode prev = cslltail;
            CSLLNode curr = prev.nxt;

            while (curr.data != data) {
                prev = curr;
                curr = curr.nxt;
            }
            prev.nxt = curr.nxt;
            curr.nxt = null;

            // 1 Node Linked List
            if (curr == prev) {
                cslltail = null;
            }

            // >=2 Node linked list
            else if (cslltail == curr) {
                cslltail = prev;
            }

            System.out.println("After Deletion Now List is : ");
            csllNodeTraversal(cslltail);

        }
    }

    static void csllNodeTraversal(CSLLNode cslltail) {

        CSLLNode temp = cslltail;

        if (cslltail == null) {
            System.out.println("List is Empty ");
            return;
        }

        do {
            System.out.println(temp.data);
            temp = temp.nxt;
        } while (temp != cslltail);
    }

    static CSLLNode insertionAtCSLL(CSLLNode cslltail, int adjElm, int data) {
        if (cslltail == null) {
            CSLLNode csllNode = new CSLLNode(data);
            cslltail = csllNode;
            csllNode.nxt = csllNode;
            return cslltail;
        } else {
            CSLLNode curr = cslltail;

            while (curr.data != adjElm) {
                curr = curr.nxt;
            }

            CSLLNode temp = new CSLLNode(data);
            temp.nxt = curr.nxt;
            curr.nxt = temp;
            return cslltail;
        }
    }

    static DllNode deleteAtPositionDll(DllNode dllHead, int pos) {
        if (pos == 1) {
            DllNode temp = dllHead;
            dllHead = dllHead.nxt; // Transfer of head
            temp.nxt.prev = null; // Disconnecting with new head
            temp.nxt = null; // Disconnecting Old Head
        } else {
            DllNode curr = dllHead;
            DllNode prev = null;
            int cnt = 1;
            while (cnt < pos) {
                prev = curr;
                curr = curr.nxt;
                cnt++;
            }
            curr.prev = null;
            prev.nxt = curr.nxt;
            curr.nxt = null;
        }
        return dllHead;
    }

    static DllNode insertAtPositionDll(DllNode dllHead, int pos, int data) {
        // Insert At Head
        if (pos == 1) {
            DllNode newNode = new DllNode(data);

            newNode.nxt = dllHead;
            dllHead.prev = newNode;
            dllHead = newNode;
            return dllHead;
        } else { // Insert at Given Position including end
            int cnt = 1;
            DllNode curr = dllHead;
            while (cnt < pos - 1) {
                curr = curr.nxt;
                cnt++;
            }

            DllNode newN = new DllNode(data);
            newN.nxt = curr.nxt;
            newN.prev = curr;
            curr.nxt = newN;
            curr.nxt.prev = newN;
            return dllHead;
        }
    }

    static int printDllLength(DllNode dllHead) {
        DllNode curr = dllHead;
        int counter = 0;
        while (curr != null) {
            curr = curr.nxt;
            counter++;
        }
        return counter;
    }

    static void printDLLTraverseNode(DllNode dllHead) {
        DllNode curr = dllHead;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.nxt;
        }
    }

    static DllNode printDLLCreateNode() {

        // Node Creation
        DllNode dllNode1 = new DllNode(10);
        DllNode dllNode2 = new DllNode(20);
        DllNode dllNode3 = new DllNode(30);
        DllNode dllNode4 = new DllNode(30);

        // Linking Nodes
        DllNode head = dllNode1;
        head.nxt = dllNode2;
        dllNode2.nxt = dllNode3;
        dllNode3.nxt = dllNode4;
        // dllNode4 = null; // tail

        System.out.println("DLL Created Successfully");

        return head;
    }

    static Node deleteAtPosition(Node sllHead, int pos) {
        if (pos == 1) {
            sllHead = sllHead.nxt;
        } else {
            Node curr = sllHead;
            Node prev = null;
            int cnt = 1;
            while (cnt < pos) {
                prev = curr;
                curr = curr.nxt;
                cnt++;
            }
            prev.nxt = curr.nxt;
        }
        return sllHead;
    }

    static Node insertAtPosition(Node sllHead, int pos, int data) {
        if (pos == 1) {
            return insertAtHead(sllHead, data);
        }

        int cnt = 1;
        Node curr = sllHead;
        while (cnt < pos - 1) {
            curr = curr.nxt;
            cnt++;
        }
        Node newN = new Node(data);
        newN.nxt = curr.nxt;
        curr.nxt = newN;
        return sllHead;
    }

    static Node insertAtTail(Node sllHead, int data) {
        Node curr = sllHead;
        Node newNode = new Node(data);
        while (curr.nxt != null) {
            curr = curr.nxt;
        }
        curr.nxt = newNode;
        return sllHead;
    }

    static Node insertAtHead(Node sllHead, int data) {
        Node newNode = new Node(data);

        newNode.nxt = sllHead;
        sllHead = newNode;
        return sllHead;
    }

    static void printSLLTraverseNode(Node sllHead) {
        if (sllHead == null) {
            System.out.println("List Empty Hai Bhai");
        }
        Node curr = sllHead;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.nxt;
        }
    }

    static Node printSLLCreateNode() {

        // Node Creation
        Node sllNode1 = new Node(10);
        Node sllNode2 = new Node(12);
        Node sllNode3 = new Node(33);
        Node sllNode4 = new Node(4);

        // Linking Nodes
        Node head = sllNode1;
        head.nxt = sllNode2;
        sllNode2.nxt = sllNode3;
        sllNode3.nxt = sllNode4;
        // sllNode4.nxt = null; // tail
        // sllNode4.nxt = sllNode2; //Make Circular

        System.out.println("SLL Created Successfully");

        return head;

    }

    static GenericNode<Integer> printSLLCreateGenericNode() {

        // Node Creation
        GenericNode<Integer> sllNode1 = new GenericNode<>(110);
        GenericNode<Integer> sllNode2 = new GenericNode<>(220);
        GenericNode<Integer> sllNode3 = new GenericNode<>(330);
        GenericNode<Integer> sllNode4 = new GenericNode<>(440);

        // Linking Nodes
        GenericNode<Integer> head = sllNode1;
        head.nxt = sllNode2;
        sllNode2.nxt = sllNode3;
        sllNode3.nxt = sllNode4;
        sllNode4 = null; // tail

        System.out.println("SLL Generic Node Created Successfully");

        return head;

    }

    static void printSLLTraverseGNode(GenericNode<Integer> sllHead) {
        GenericNode<Integer> curr = sllHead;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.nxt;
        }
    }

}