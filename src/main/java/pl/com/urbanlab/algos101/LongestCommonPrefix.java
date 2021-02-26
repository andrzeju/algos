package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class LongestCommonPrefix {

    public static String getLongestPrefix(String [] words) {
        return null;
    }

    public static void main(String[] args) {
        String [] flStrings = {"float", "fling", "flat"};
        Assert.assertEquals("fl", getLongestPrefix(flStrings));
        Assert.assertNotEquals("fli", getLongestPrefix(flStrings));
        Assert.assertNotEquals("f", getLongestPrefix(flStrings));
    }
}
