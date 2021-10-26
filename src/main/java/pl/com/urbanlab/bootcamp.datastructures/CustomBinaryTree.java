package pl.com.urbanlab.bootcamp.datastructures;

public class CustomBinaryTree {

    private CustomTreeNode data;

    public void insert(int key, String value) {
        data = putRecursively(key, value, data);
    }

    private CustomTreeNode putRecursively(int key, String value, CustomTreeNode node) {
        if (node == null) {
            node = new CustomTreeNode(key, value);
        } else if (key > node.key) {
            node.right = putRecursively(key, value, node.right);
        } else {
            node.left = putRecursively(key, value, node.left);
        }
        return node;
    }

    public String find(int key) {
        return findRecursively(key, data);
    }

    private String findRecursively(int key, CustomTreeNode node) {
        if (node == null) {
            return null;
        }
        String value;
        if (node.key == key) {
            value = node.value;
        } else if (key > node.key) {
            value = findRecursively(key, node.right);
        } else {
            value = findRecursively(key, node.left);
        }
        return value;
    }

    public String findMinimum() {
        if (data == null) {
            throw new IllegalStateException("No elements in the tree");
        }

        return data.min().value;
    }

    public CustomTreeNode findMinimum(CustomTreeNode node) {
        if (node == null) {
            throw new IllegalStateException("No elements in the tree");
        }

        return node.min();
    }

    public void delete(int key) {
        if (data == null) {
            throw new IllegalStateException("No elements in the tree");
        }

        data = deleteRecursively(key, data);
    }

    private CustomTreeNode deleteRecursively(int key, CustomTreeNode node) {
        if (node.key == key) {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
                //promote one node up
            } else if (node.right == null) {
                //promote one node up
                return node.left;
            } else {
                //replace with right min and delete low duplicate
                CustomTreeNode minNode = findMinimum(node.right);
                node.key = minNode.key;
                node.value = minNode.value;
                node.right = deleteRecursively(minNode.key, node.right);
            }
        } else if (key > node.key) {
            node.right = deleteRecursively(key, node.right);
        } else {
            node.left = deleteRecursively(key, node.left);
        }
        return node;
    }

    private class CustomTreeNode {
        private int key;
        private String value;
        private CustomTreeNode left, right;

        public CustomTreeNode(int key, String value) {
            this.key = key;
            this.value = value;
        }

        private CustomTreeNode min() {
            if (this.left == null) {
                return this;
            } else {
                return this.left.min();
            }
        }
    }
}
