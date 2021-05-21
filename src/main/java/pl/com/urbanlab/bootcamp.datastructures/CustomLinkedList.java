package pl.com.urbanlab.bootcamp.datastructures;

public class CustomLinkedList {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public static Node getLast(Node node) {
            return node.next == null ? node : Node.getLast(node.next);
        }
    }

    private Node head;

    public void addToFront(int i) {
        Node newHead = new Node(i);
        if (head != null) {
            newHead.next = head;
        }
        head = newHead;
    }

    public void addToFrontNoCondition(int i) {
        Node newHead = new Node(i);
        newHead.next = head;
        head = newHead;
    }

    public int getFirst() {
        throwExceptionOnEmptyList();
        return head.data;
    }

    public int getLast() {
        throwExceptionOnEmptyList();
        return Node.getLast(head).data;
    }

    private void throwExceptionOnEmptyList() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
    }
}
