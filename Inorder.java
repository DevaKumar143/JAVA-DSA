import java.util.*;
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    
    public BinaryTree() {
        root = null;
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");

        preorder(node.left);

        preorder(node.right);
    }

    void preorder() {
        preorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is:");
        tree.preorder();
    }
}
