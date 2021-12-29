package pl.com.urbanlab.algos101;

public class TreesRightNeighbourMarker {

    public Node connect(Node root) {
        if (root == null || root.left == null || root.right == null) {
            return root;
        }

        root.left.next = root.right;
        root.right.next = root.next != null ? root.next.left : null;
        connect(root.left);
        connect(root.right);
        return root;
    }

    public Node connectUnbalanced(Node root) {
        if (root == null) {
            return null;
        }

        if (root.next != null && root.right != null) {
            root.right.next = root.next.left != null ? root.next.left : findToTheRight(root.next);
        }
        if (root.left != null) {
            root.left.next = root.right != null ? root.right : findToTheRight(root.next);
        }

        connectUnbalanced(root.right);
        connectUnbalanced(root.left);
        return root;
    }

    private Node findToTheRight(Node node) {
        if (node == null) {
            return null;
        }
        if (node.left != null) {
            return node.left;
        }
        if (node.right != null) {
            return node.right;
        }
        return findToTheRight(node.next);
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}