import linkedlist.singlylinkedlist.GenericNode;
import linkedlist.singlylinkedlist.Node;
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
        DllNode dllHead = printDLLCreateNode();
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