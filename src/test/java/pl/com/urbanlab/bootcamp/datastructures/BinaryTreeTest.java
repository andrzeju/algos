package pl.com.urbanlab.bootcamp.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    CustomBinaryTree tree;

    @Before
    public void setup() {
        tree = new CustomBinaryTree();
    }

    @Test
    public void testInsertAndFind() {
        tree.insert(1, "Bejing");
        tree.insert(3, "New York");
        tree.insert(5, "London");
        tree.insert(2, "Dehli");
        tree.insert(0, "Sosnowiec");

        assertEquals("Bejing", tree.find(1));
        assertEquals("New York", tree.find(3));
        assertEquals("London", tree.find(5));
        assertEquals("Dehli", tree.find(2));
    }

    @Test
    public void testMinimum() {
        tree.insert(1, "Bejing");
        tree.insert(3, "New York");
        tree.insert(5, "London");
        tree.insert(2, "Dehli");
        tree.insert(0, "Sosnowiec");

        assertEquals("Sosnowiec", tree.findMinimum());

    }

}
