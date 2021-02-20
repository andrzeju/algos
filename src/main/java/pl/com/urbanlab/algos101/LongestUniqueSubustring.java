package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class LongestUniqueSubustring {

    /** Length of a longest substring without repeating characters */
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        StringBuilder substring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (substring.indexOf(s.substring(i, i + 1)) != -1) {
                break;
            }
            substring.append(s.charAt(i));

            if (substring.length() > maxLength) {
                maxLength = substring.length();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Assert.assertEquals(3, lengthOfLongestSubstring("abcabc"));
        Assert.assertEquals(1, lengthOfLongestSubstring("aaaa"));
        Assert.assertEquals(4, lengthOfLongestSubstring("ugghjklg"));
    }
}
