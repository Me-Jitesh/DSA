package implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    public class Node {
        int data;
        Node left;
        Node right;

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
}
