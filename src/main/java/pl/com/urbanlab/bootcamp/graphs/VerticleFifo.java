package pl.com.urbanlab.bootcamp.graphs;

import java.util.LinkedList;

public class VerticleFifo implements VerticleQueue {

    private final LinkedList<Integer> queue = new LinkedList<>();

    @Override
    public void add(Integer value) {
        queue.add(value);
    }

    @Override
    public Integer next() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
