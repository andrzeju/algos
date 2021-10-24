package pl.com.urbanlab.bootcamp.datastructures;

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
    public void testPutAndGet() {
        hashTable.put("John Wayne", "555-33-22");
        hashTable.put("Jane Doe", "555-22-11");
        assertEquals("555-33-22", hashTable.get("John Wayne"));
        assertEquals("555-22-11", hashTable.get("Jane Doe"));
    }

    @Test
    public void testCollisionByProvidingMoreEntriesThanTableSize() {
        hashTable.put("Jane Doe0", "555-22-10");
        hashTable.put("Jane Doe1", "555-22-11");
        hashTable.put("Jane Doe2", "555-22-12");
        hashTable.put("Jane Doe3", "555-22-13");
        hashTable.put("Jane Doe4", "555-22-14");
        hashTable.put("Jane Doe5", "555-22-15");
        hashTable.put("Jane Doe6", "555-22-16");
        hashTable.put("Jane Doe7", "555-22-17");
        hashTable.put("Jane Doe8", "555-22-18");
        hashTable.put("Jane Doe9", "555-22-19");

        assertEquals("555-22-10", hashTable.get("Jane Doe0"));
        assertEquals("555-22-11", hashTable.get("Jane Doe1"));
        assertEquals("555-22-12", hashTable.get("Jane Doe2"));
        assertEquals("555-22-13", hashTable.get("Jane Doe3"));
        assertEquals("555-22-14", hashTable.get("Jane Doe4"));
        assertEquals("555-22-15", hashTable.get("Jane Doe5"));
        assertEquals("555-22-16", hashTable.get("Jane Doe6"));
        assertEquals("555-22-17", hashTable.get("Jane Doe7"));
        assertEquals("555-22-18", hashTable.get("Jane Doe8"));
        assertEquals("555-22-19", hashTable.get("Jane Doe9"));
    }

}
