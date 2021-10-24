package pl.com.urbanlab.bootcamp.datastructures;

import org.junit.Before;
import org.junit.Test;

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
    public void addToBack() {
        linkedList.addToFront(1);
        linkedList.addToBack(2);

        assertEquals(1, linkedList.getFirst());
        assertEquals(2, linkedList.getLast());
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
    public void sizeTest() {
        assertEquals(0, linkedList.size());
        linkedList.addToFront(6);
        assertEquals(1, linkedList.size());
        linkedList.addToBack(3);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void clearTest() {
        linkedList.addToFront(6);
        linkedList.addToBack(3);
        assertEquals(2, linkedList.size());
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test
    public void deleteValueTest() {
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        linkedList.deleteSingleValue(2);
        assertEquals(2, linkedList.size());
        assertEquals(1, linkedList.getLast());
        assertEquals(3, linkedList.getFirst());
        linkedList.deleteSingleValue(1);
        linkedList.deleteSingleValue(15);
        assertEquals(1, linkedList.size());
        linkedList.deleteSingleValue(3);
        assertEquals(0, linkedList.size());
    }

    @Test(expected = IllegalStateException.class)
    public void getFirstExceptionHandledWhenListEmptyTest() {
        linkedList.getFirst();
    }

    @Test(expected = IllegalStateException.class)
    public void getLastExceptionHandledWhenListEmptyTest() {
        linkedList.getLast();
    }

    @Test
    public void addToFrontPerformanceTest() {
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.addToFront(42);
        }
    }

    @Test
    public void addToFrontNoConditionPerformanceTest() {
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.addToFrontNoCondition(42);
        }
    }
}
