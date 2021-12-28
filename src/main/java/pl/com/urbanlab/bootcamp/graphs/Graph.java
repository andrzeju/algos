package pl.com.urbanlab.bootcamp.graphs;

import java.util.LinkedList;

public class Graph {

    private final LinkedList<Integer>[] adjacentList;
    private final int verticlesNumber;

    public Graph(int verticles) {
        this.verticlesNumber = verticles;
        adjacentList = new LinkedList[verticles];
        for (int i = 0; i < verticles; i++) {
            adjacentList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjacentList[i].add(j);
    }

    public String searchBreadthFirst(int startVerticle) {
        return searchGraph(startVerticle, new VerticleFifo());
    }

    public String searchDepthFirst(int startVerticle) {
        return searchGraph(startVerticle, new VerticleLifo());
    }

    private String searchGraph(int startVerticle, VerticleQueue queue) {
        StringBuilder traverseOrder = new StringBuilder();
        boolean[] visited = new boolean[verticlesNumber];
        queue.add(startVerticle);
        visited[startVerticle] = true;

        while (!queue.isEmpty()) {
            Integer nextVerticleFromQueue = queue.next();
            traverseOrder.append(nextVerticleFromQueue);
            for (Integer next : adjacentList[nextVerticleFromQueue]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }

        return traverseOrder.toString();
    }

}

