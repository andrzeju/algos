package pl.com.urbanlab.algos101.bootcamp.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomHashTableTest {

    private CustomHashTable hashTable;

    @Before
    public void setup() {
        hashTable = new CustomHashTable();
    }

    @Test
    public void putAndGet() {
        hashTable.put("John Wayne", "555-33-22");
        hashTable.put("Jane Doe", "555-22-11");
        assertEquals("555-33-22", hashTable.get("John Wayne"));
        assertEquals("555-22-11", hashTable.get("Jane Doe"));
    }

}
