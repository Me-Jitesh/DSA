import linkedlist.Node;

public class LearningDsa {

    public static void main(String[] args) {

        Node sllHead = printSLLCreateNode();

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
        sllNode4 = null; // tail

        System.out.println("SLL Created Successfully");

        return head;

    }
}