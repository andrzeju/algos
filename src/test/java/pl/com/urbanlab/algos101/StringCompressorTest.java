package pl.com.urbanlab.algos101;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressorTest {

    @Test
    public void testSpringCompressed() {
        StringCompressor compressor = new StringCompressor();

        char[] oneCharString = {'a'};
        assertEquals(1, compressor.compress(oneCharString));

        char[] charString = {'a','a','b','b','b','c'};
        assertEquals(5, compressor.compress(charString));

//        char[] longerText = {'a','b','b','b','b','c','c','c','c','c','a','a'};
//        assertEquals(7, compressor.compress(longerText));

        //test more than 10 duplicates
    }
}