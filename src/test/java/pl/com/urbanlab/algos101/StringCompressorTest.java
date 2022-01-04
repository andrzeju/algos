package pl.com.urbanlab.algos101;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressorTest {

    @Test
    public void testSpringCompressed() {
        StringCompressor compressor = new StringCompressor();

        char[] oneCharString = {'a'};
        assertEquals(1, compressor.compress(oneCharString));

        char[] uniqueString = {'a','b','c','d','e','f'};
        assertEquals(6, compressor.compress(uniqueString));

        char[] charString = {'a','a','b','b','b','c'};
        assertEquals(5, compressor.compress(charString));
        assertEquals('a', charString[0]);
        assertEquals('2', charString[1]);
        assertEquals('b', charString[2]);
        assertEquals('3', charString[3]);
        assertEquals('c', charString[4]);

        char[] longerText = {'a','b','b','b','b','c','c','c','c','c','a','a'};
        assertEquals(7, compressor.compress(longerText));

        //test more than 10 duplicates
    }
}