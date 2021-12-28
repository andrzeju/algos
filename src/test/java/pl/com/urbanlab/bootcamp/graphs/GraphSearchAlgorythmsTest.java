package pl.com.urbanlab.bootcamp.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphSearchAlgorythmsTest {

    private Graph graph;

    @Before
    public void setup() {
        graph = new Graph(8);
        graph.addEdge(0,1);
        graph.addEdge(1,0);
        graph.addEdge(1,4);
        graph.addEdge(4,1);
        graph.addEdge(4,6);
        graph.addEdge(6,4);
        graph.addEdge(6,0);
        graph.addEdge(0,6);
        graph.addEdge(1,5);
        graph.addEdge(5,1);
        graph.addEdge(5,3);
        graph.addEdge(3,5);
        graph.addEdge(3,0);
        graph.addEdge(0,3);
        graph.addEdge(5,2);
        graph.addEdge(2,5);
        graph.addEdge(2,7);
        graph.addEdge(7,2);
    }

    @Test
    public void testBreadthFirst() {
        String traverseOrder = graph.searchBreadthFirst(0);
        Assert.assertEquals("01634527", traverseOrder);
    }

    @Test
    public void testDepthFirst() {
        String traverseOrder = graph.searchDepthFirst(0);
        Assert.assertEquals("03527641", traverseOrder);
    }
}