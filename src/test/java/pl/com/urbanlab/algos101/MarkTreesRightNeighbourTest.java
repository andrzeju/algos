package pl.com.urbanlab.algos101;

import org.junit.Assert;
import org.junit.Test;

public class MarkTreesRightNeighbourTest {

    private final TreesRightNeighbourMarker marker = new TreesRightNeighbourMarker();



    @Test
    public void testNeighboursEmptyOrNull() {
        Node emptyResult = marker.connect(new Node());
        Assert.assertNull(emptyResult.left);
        Assert.assertNull(emptyResult.right);
        Assert.assertNull(emptyResult.next);
        Assert.assertEquals(0, emptyResult.val);

        Node nullResult = marker.connect(null);
        Assert.assertNull(nullResult);
    }

    @Test
    public void testNeighboursAdded() {
        Node nodeLeft = new Node(2, new Node(4), new Node(5), null);
        Node nodeRight = new Node(3, new Node(6), new Node(7), null);
        Node rootNode = new Node(1, nodeLeft, nodeRight, null);
        Node result = marker.connect(rootNode);

        Assert.assertNull(result.next);
        Assert.assertNull(result.right.next);
        Assert.assertNull(result.right.right.next);

        Assert.assertEquals(result.left.next.val, result.right.val);
        Assert.assertEquals(result.left.left.next.val, result.left.right.val);
        Assert.assertEquals(result.left.right.next.val, result.right.left.val);
    }

    @Test
    public void testNeighboursAddedThreeLeves() {
        Node nodeLeftLeft = new Node(2, new Node(6), new Node(7), null);
        Node nodeLeftRight = new Node(3, new Node(8), new Node(9), null);
        Node nodeRightLeft = new Node(4, new Node(10), new Node(11), null);
        Node nodeRightRight = new Node(5, new Node(12), new Node(13), null);
        Node nodeLeft = new Node(0, nodeLeftLeft, nodeLeftRight, null);
        Node nodeRight = new Node(1, nodeRightLeft, nodeRightRight, null);
        Node rootNode = new Node(-1, nodeLeft, nodeRight, null);
        Node result = marker.connect(rootNode);

        Assert.assertNull(result.next);
        Assert.assertNull(result.right.next);
        Assert.assertNull(result.right.right.next);

        Assert.assertEquals(result.left.next.val, result.right.val);
        Assert.assertEquals(result.left.left.next.val, result.left.right.val);
        Assert.assertEquals(result.left.right.next.val, result.right.left.val);

    }

}
