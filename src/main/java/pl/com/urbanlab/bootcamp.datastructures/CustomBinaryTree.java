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

        return data.min();
    }

    private class CustomTreeNode {
        private final int key;
        private final String value;
        private CustomTreeNode left, right;

        public CustomTreeNode(int key, String value) {
            this.key = key;
            this.value = value;
        }

        private String min() {
            if (this.left == null) {
                return this.value;
            } else {
                return this.left.min();
            }
        }
    }
}