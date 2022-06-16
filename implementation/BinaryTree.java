package implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    public class Node {
        public int data;
        public Node left;
        public Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node buildTree(Node root) {

        System.out.print("Enter The Data : ");

        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        // scanner.close();

        root = new Node(data);

        if (data == -1) {
            return null;
        }

        System.out.println("Enter Data For Inserting in Left  Of " + data);
        root.left = buildTree(root.left);

        System.out.println("Enter Data For Inserting in Right  Of " + data);
        root.right = buildTree(root.right);

        return root;
    }

    public Node buildTreeFromLevelOrderTravesal(Node root) {
        Queue<Node> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Data : ");
        int data = scanner.nextInt();
        // scanner.close();

        root = new Node(data);
        queue.add(root);

        while (!queue.isEmpty()) {

            Node temp = queue.remove();

            System.out.println("Enter Left Node For : " + temp.data);

            int leftData = scanner.nextInt();

            if (leftData != -1) {
                temp.left = new Node(leftData);
                queue.add(temp.left);
            }

            System.out.println("Enter Right Node For : " + temp.data);

            int rightData = scanner.nextInt();

            if (rightData != -1) {
                temp.right = new Node(rightData);
                queue.add(temp.right);
            }
        }
        return root;
    }

    public void levelOrderTraversal(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // Separator to identify level

        while (!queue.isEmpty()) {

            Node temp = queue.remove();

            if (temp == null) { // old level completed
                System.out.println();
                if (!queue.isEmpty()) { // queue still has some child element
                    queue.add(null);
                }
            } else {

                System.out.print(temp.data + "\t");

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    public void inOrderTraversal(Node root) {

        // base case
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + "\t");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root) {

        // base case
        if (root == null) {
            return;
        }
        System.out.print(root.data + "\t");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {

        // base case
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + "\t");
    }
}
