package pl.com.urbanlab.bootcamp.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {

    private DynamicArray<String> array;

    @Before
    public void setUp() {
        array = new DynamicArray<>(2);
    }

    @Test
    public void getAndSet() {
        array.set(0, "a");
        Assert.assertEquals("a", array.get(0));
    }

    @Test
    public void insert() {
        array.add("a"); // 0
        array.add("b"); // 1
        array.add("d"); // 2
        array.add("e"); // 3

        array.insert(2, "c");

        Assert.assertEquals(5, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("b", array.get(1));
        Assert.assertEquals("c", array.get(2));
        Assert.assertEquals("d", array.get(3));
        Assert.assertEquals("e", array.get(4));
    }

    @Test
    public void deleteFirst() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(0);

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("b", array.get(0));
        Assert.assertEquals("c", array.get(1));
        Assert.assertNull(array.get(2));
    }

    @Test
    public void deleteMiddle() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(1);

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("c", array.get(1));
        Assert.assertNull(array.get(2));
    }

    @Test
    public void deleteLast() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(2);

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("b", array.get(1));
        Assert.assertNull(array.get(2));
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue(array.isEmpty());
        array.add("a");
        Assert.assertFalse(array.isEmpty());
    }

    @Test
    public void contains()  {
        Assert.assertFalse(array.contains("a"));
        array.add("a");
        Assert.assertTrue(array.contains("a"));
        array.add("b");
        array.add("b");
        array.add("c");
        Assert.assertTrue(array.contains("b"));
        Assert.assertTrue(array.contains("c"));
        array.delete(3);
        Assert.assertFalse(array.contains("c"));
        array.delete(2);
        Assert.assertTrue(array.contains("b"));
        array.delete(1);
        Assert.assertFalse(array.contains("b"));
        array.delete(0);
        Assert.assertFalse(array.contains("a"));
    }

}
