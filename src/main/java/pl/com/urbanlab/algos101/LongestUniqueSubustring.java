package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class LongestUniqueSubustring {

    /** Length of a longest substring without repeating characters */
    public static int lengthOfLongestSubstring(String s) {
        return 0;
    }

    public static void main(String[] args) {
        Assert.assertEquals(3, lengthOfLongestSubstring("abcabc"));
        Assert.assertEquals(1, lengthOfLongestSubstring("aaaa"));
        Assert.assertEquals(4, lengthOfLongestSubstring("ugghjklg"));
    }
}
