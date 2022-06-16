package implementation;

import java.util.Scanner;

public class BinaryTree {

    class Node {
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
}
