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
    private int size;

    public void addToFront(int i) {
        Node newHead = new Node(i);
        if (head != null) {
            newHead.next = head;
        }
        head = newHead;
        size++;
    }

    public void addToFrontNoCondition(int i) {
        Node newHead = new Node(i);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void addToBack(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
        } else {
            Node tail = Node.getLast(head);
            tail.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void deleteSingleValue(int i) {
        if (head == null) {
            return;
        }

        if (head.data == i) {
            head = head.next;
            size--;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            Node nextNode = currentNode.next;
            if (nextNode.data == i) {
                currentNode.next = nextNode.next;
                size--;
                return;
            }
            currentNode = currentNode.next;

        }
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
