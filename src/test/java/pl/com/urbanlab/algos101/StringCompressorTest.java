package pl.com.urbanlab.algos101;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressorTest {

    private final StringCompressor compressor = new StringCompressor();

    @Test
    public void testShort() {
        char[] oneCharString = {'a'};
        assertEquals(1, compressor.compress(oneCharString));
    }

    @Test
    public void testUnique() {
        char[] uniqueString = {'a','b','c','d','e','f'};
        assertEquals(6, compressor.compress(uniqueString));
    }

    @Test
    public void testStringCompressed() {
        char[] charString = {'a','a','b','b','b','c'};
        assertEquals(5, compressor.compress(charString));
        assertEquals('a', charString[0]);
        assertEquals('2', charString[1]);
        assertEquals('b', charString[2]);
        assertEquals('3', charString[3]);
        assertEquals('c', charString[4]);

        char[] longerText = {'a','b','b','b','b','c','c','c','c','c','a','a'};
        assertEquals(7, compressor.compress(longerText));
    }

//    @Test
    public void testMultipleDigitDuplicates() {
        char[] doubleDigitDuplicates = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assertEquals(4, compressor.compress(doubleDigitDuplicates));
        assertEquals('a', doubleDigitDuplicates[0]);
        assertEquals('b', doubleDigitDuplicates[1]);
        assertEquals('1', doubleDigitDuplicates[2]);
        assertEquals('2', doubleDigitDuplicates[3]);

    }
}