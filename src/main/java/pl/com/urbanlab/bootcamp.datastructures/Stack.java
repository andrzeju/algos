package pl.com.urbanlab.bootcamp.datastructures;

import java.util.LinkedList;

public class Stack {

    private LinkedList<Object> stackLog = new LinkedList<>();

    public void push(Object item) {
        stackLog.push(item);
    }

    public Object pop() {
        return stackLog.pop();
    }

    public Object peek() {
        return stackLog.peek();
    }
}
