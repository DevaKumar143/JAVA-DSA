import java.util.*;

public class Chartree {
    static class Node {
        String data;
        Node left;
        Node right;

        Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
      Node root = new Node("A");
	  root.left = new Node("B");
	  root.right = new Node("C");
	  root.left.left = new Node("D");
	  root.left.right = new Node("E");
	  root.right.left = new Node("F");
	  root.right.right = new Node("G");

      preorder(root);
    }
}
