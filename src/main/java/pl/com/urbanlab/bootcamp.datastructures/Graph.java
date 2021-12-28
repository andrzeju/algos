package pl.com.urbanlab.bootcamp.datastructures;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    private final LinkedList<Integer>[] adjacentList;
    private final int verticles;

    public Graph(int verticles) {
        this.verticles = verticles;
        adjacentList = new LinkedList[verticles];
        for (int i = 0; i < verticles; i++) {
            adjacentList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjacentList[i].add(j);
    }

    public String searchBreadthFirst(int startVerticle) {
        StringBuilder traverseOrder = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[verticles];
        queue.add(startVerticle);
        visited[startVerticle] = true;

        while (!queue.isEmpty()) {
            Integer lastFromQueue = queue.poll();
            traverseOrder.append(lastFromQueue);
            for (Integer next : adjacentList[lastFromQueue]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }

        return traverseOrder.toString();
    }

    public String searchDepthFirst(int startVerticle) {
        StringBuilder traverseOrder = new StringBuilder();
        java.util.Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[verticles];
        stack.push(startVerticle);
        visited[startVerticle] = true;

        while (!stack.isEmpty()) {
            Integer topFromStack = stack.pop();
            traverseOrder.append(topFromStack);
            for (Integer next : adjacentList[topFromStack]) {
               if (!visited[next]) {
                    stack.push(next);
                    visited[next] = true;
               }
            }
        }
        return traverseOrder.toString();
    }
}
