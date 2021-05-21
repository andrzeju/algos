package pl.com.urbanlab.algos101.bootcamp.datastructures;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import pl.com.urbanlab.bootcamp.datastructures.CustomLinkedList;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    private CustomLinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new CustomLinkedList();
    }

    @Test
    public void addToFront() {
        linkedList.addToFront(3);
        linkedList.addToFront(2);
        linkedList.addToFront(1);

        assertEquals(1, linkedList.getFirst());
        assertEquals(3, linkedList.getLast());
    }

    @Test
    public void testGetFirst() {
        linkedList.addToFront(1);
        assertEquals(1, linkedList.getFirst());

        linkedList.addToFront(2);
        assertEquals(2, linkedList.getFirst());
    }

    @Test
    public void testGetLast() {
        linkedList.addToFront(1);
        assertEquals(1, linkedList.getLast());

        linkedList.addToFront(2);
        assertEquals(1, linkedList.getLast());
    }

    @Test
    public void addToFrontPerformanceTest() {
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.addToFront(42);
        }
    }

    @Test
    public void addToFrontPerformanceTestNoCondition() {
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.addToFrontNoCondition(42);
        }
    }
}
