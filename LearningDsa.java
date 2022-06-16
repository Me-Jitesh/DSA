import implementation.BinaryTree;
import implementation.BinaryTree.Node;
import questions.CountNoOfLeafNodes;

public class LearningDsa {

    public static void main(String[] args) {
        // testBinaryTree();
        testNoOfLeaf();
    }

    static void testNoOfLeaf() {
        Node root = new BinaryTree().buildTree(null);
        new CountNoOfLeafNodes().noOfLeafNodes(root);
    }

    static void testBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();

        // System.out.println("***** Build Tree *******");
        // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
        // Node root = binaryTree.buildTree(null);

        System.out.println("***** Build Tree From Level Order Travesal *******");
        // 1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1
        Node root = binaryTree.buildTreeFromLevelOrderTravesal(null);

        System.out.println("***** Level Order Traversal *******");
        binaryTree.levelOrderTraversal(root);

        // System.out.println("***** In Order Traversal(LNR) *******");
        // binaryTree.inOrderTraversal(root);

        // System.out.println("***** Pre Order Traversal(NLR) *******");
        // binaryTree.preOrderTraversal(root);

        // System.out.println("***** Post Order Traversal(LRN) *******");
        // binaryTree.postOrderTraversal(root);
    }
}
