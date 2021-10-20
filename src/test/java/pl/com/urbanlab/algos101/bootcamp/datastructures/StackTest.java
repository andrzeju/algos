package pl.com.urbanlab.algos101.bootcamp.datastructures;

import org.junit.Before;
import org.junit.Test;
import pl.com.urbanlab.bootcamp.datastructures.Stack;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private Stack stack;

    @Before
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void pushAndPop() {
        stack.push("hello");
        stack.push("world");
        String greeting = (String) stack.pop();
        assertEquals("world", greeting);
        String greetingContinued = (String) stack.pop();
        assertEquals("hello", greetingContinued);
    }

    @Test
    public void peek() {

    }

}
