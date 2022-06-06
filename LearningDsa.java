import linkedlist.singlylinkedlist.GenericNode;
import linkedlist.singlylinkedlist.Node;
import linkedlist.singlylinkedlist.questions.MidOfLinkedList;
// import linkedlist.singlylinkedlist.questions.ReverseLinkedList;
import linkedlist.circulerlinkedlist.CSLLNode;
import linkedlist.doublylinkedlist.DllNode;

public class LearningDsa {

    public static void main(String[] args) {

        // Singly Linked List
        // Node sllHead = printSLLCreateNode();
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
        Node sllHead = printSLLCreateNode();
        // head = new ReverseLinkedList().reverseApproach1(head);
        // printSLLTraverseNode(head);
        // new ReverseLinkedList().reverseApproach2(head, head, null);
        // head = new ReverseLinkedList().reverseApproach3(head);
        // printSLLTraverseNode(head);

        // sllHead = insertAtHead(sllHead, 50);
        // sllHead = insertAtHead(sllHead, 60);
        // sllHead = insertAtHead(sllHead, 70);
        new MidOfLinkedList().midOfLinkedListApproach1(sllHead);
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
        DllNode dllNode4 = new DllNode(40);

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
        Node curr = sllHead;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.nxt;
        }
    }

    static Node printSLLCreateNode() {

        // Node Creation
        Node sllNode1 = new Node(10);
        Node sllNode2 = new Node(20);
        Node sllNode3 = new Node(30);
        Node sllNode4 = new Node(40);

        // Linking Nodes
        Node head = sllNode1;
        head.nxt = sllNode2;
        sllNode2.nxt = sllNode3;
        sllNode3.nxt = sllNode4;
        // sllNode4 = null; // tail

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