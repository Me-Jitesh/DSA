package questions;

import implementation.BinaryTree.Node;

public class CountNoOfLeafNodes {
    int cnt = 0;

    public void noOfLeafNodes(Node root) {
        inOrder(root);
        System.out.println("No of Leaf node is : " + cnt);
    }

    private void inOrder(Node root) {

        // base case
        if (root == null) {
            return;
        }
        inOrder(root.left);

        // leaf node
        if (root.left == null && root.right == null) {
            this.cnt++;
        }
        inOrder(root.right);
    }

}
