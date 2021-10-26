package pl.com.urbanlab.bootcamp.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    CustomBinaryTree tree;

    @Before
    public void setup() {
        tree = new CustomBinaryTree();
        tree.insert(1, "Bejing");
        tree.insert(3, "New York");
        tree.insert(5, "London");
        tree.insert(2, "Dehli");
        tree.insert(0, "Sosnowiec");
        tree.insert(6, "Maine");
        tree.insert(4, "Boston");
        tree.insert(7, "Chicago");
    }

    @Test
    public void testInsertAndFind() {
        assertEquals("Bejing", tree.find(1));
        assertEquals("New York", tree.find(3));
        assertEquals("London", tree.find(5));
        assertEquals("Dehli", tree.find(2));
    }

    @Test
    public void testMinimum() {
        assertEquals("Sosnowiec", tree.findMinimum());
    }

    @Test(expected = IllegalStateException.class)
    public void testMinimumExceptionOnEmptyTree() {
        tree = new CustomBinaryTree();
        tree.findMinimum();
    }

    @Test(expected = IllegalStateException.class)
    public void testDeleteExceptionOnEmptyTree() {
        tree = new CustomBinaryTree();
        tree.delete(4);
    }

    @Test
    public void testDelete() {
        tree.delete(0);
        assertNull(tree.find(0));

        tree.delete(5);
        assertNull(tree.find(5));
        assertNotNull(tree.find(2));
        assertNotNull(tree.find(6));
        assertNotNull(tree.find(7));
    }

}
