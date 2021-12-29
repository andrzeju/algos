package pl.com.urbanlab.algos101;

import org.junit.Assert;
import org.junit.Test;

public class MarkTreesRightNeighbourTest {

    private final TreesRightNeighbourMarker marker = new TreesRightNeighbourMarker();

    @Test
    public void testNeighboursEmptyOrNull() {
        Node emptyResult = marker.connect(new Node());
        testEmptyNode(emptyResult, emptyResult.left, emptyResult.right, 0, emptyResult.val);

        Node nullResult = marker.connect(null);
        Assert.assertNull(nullResult);
    }

    @Test
    public void testNeighboursAdded() {
        Node nodeLeft = new Node(2, new Node(4), new Node(5), null);
        Node nodeRight = new Node(3, new Node(6), new Node(7), null);
        Node rootNode = new Node(1, nodeLeft, nodeRight, null);
        Node result = marker.connect(rootNode);

        testBalanced(result, result.right.left);
    }

    @Test
    public void testNeighboursAddedThreeLevels() {
        Node nodeLeftLeft = new Node(2, new Node(6), new Node(7), null);
        Node nodeLeftRight = new Node(3, new Node(8), new Node(9), null);
        Node nodeRightLeft = new Node(4, new Node(10), new Node(11), null);
        Node nodeRightRight = new Node(5, new Node(12), new Node(13), null);
        Node nodeLeft = new Node(0, nodeLeftLeft, nodeLeftRight, null);
        Node nodeRight = new Node(1, nodeRightLeft, nodeRightRight, null);
        Node rootNode = new Node(-1, nodeLeft, nodeRight, null);
        Node result = marker.connect(rootNode);

        testBalanced(result, result.right.left);
    }

    @Test
    public void testUnbalancedNeighboursEmptyOrNull() {
        Node emptyResult = marker.connectUnbalanced(new Node());

        testEmptyNode(emptyResult, emptyResult.left, emptyResult.right, 0, emptyResult.val);

        Node nullResult = marker.connectUnbalanced(null);
        Assert.assertNull(nullResult);
    }

    @Test
    public void testUnbalancedNeighboursAdded() {
        Node nodeLeft = new Node(2, new Node(4), new Node(5), null);
        Node nodeRight = new Node(3, null, new Node(7), null);
        Node rootNode = new Node(1, nodeLeft, nodeRight, null);
        Node result = marker.connectUnbalanced(rootNode);

        testBalanced(result, result.right.right);
    }

    @Test
    public void testUnbalancedTwoNullsInARowNeighboursAdded() {
        Node nodeLeft = new Node(2, new Node(4), null, null);
        Node nodeRight = new Node(3, null, new Node(5), null);
        Node rootNode = new Node(1, nodeLeft, nodeRight, null);
        Node result = marker.connectUnbalanced(rootNode);

        testEmptyNode(result.right.right, result.next, result.right.next, result.left.next.val, 3);

        Assert.assertEquals(result.left.left.next.val, 5);
        Assert.assertNull(result.left.right);
    }

    @Test
    public void testUnbalancedNeighboursAddedThreeLevels() {
        Node nodeLeftLeft = new Node(2, new Node(6), new Node(7), null);
        Node nodeRightLeft = new Node(4, null, null, null);
        Node nodeRightRight = new Node(5, new Node(12), new Node(13), null);
        Node nodeLeft = new Node(0, nodeLeftLeft, null, null);
        Node nodeRight = new Node(1, nodeRightLeft, nodeRightRight, null);
        Node rootNode = new Node(-1, nodeLeft, nodeRight, null);
        Node result = marker.connectUnbalanced(rootNode);

        testEmptyNode(result.right.right, result.next, result.right.next, result.left.next.val, 1);

        Assert.assertEquals(result.left.left.next.val, 4);
        Assert.assertNull(result.left.right);
        Assert.assertEquals(result.left.left.right.next.val, 12);
    }

    private void testEmptyNode(Node emptyResult, Node left, Node right, int i, int val) {
        Assert.assertNull(left);
        Assert.assertNull(right);
        Assert.assertNull(emptyResult.next);
        Assert.assertEquals(i, val);
    }

    private void testBalanced(Node result, Node left) {
        Assert.assertNull(result.next);
        Assert.assertNull(result.right.next);
        Assert.assertNull(result.right.right.next);

        Assert.assertEquals(result.left.next.val, result.right.val);
        Assert.assertEquals(result.left.left.next.val, result.left.right.val);
        Assert.assertEquals(result.left.right.next.val, left.val);
    }

}
