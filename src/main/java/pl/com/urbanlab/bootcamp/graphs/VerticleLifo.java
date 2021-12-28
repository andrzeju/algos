package pl.com.urbanlab.bootcamp.graphs;

import java.util.Stack;

public class VerticleLifo implements VerticleQueue {

    private final Stack<Integer> stack = new Stack();

    @Override
    public void add(Integer value) {
        stack.push(value);
    }

    @Override
    public Integer next() {
        return stack.pop();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
