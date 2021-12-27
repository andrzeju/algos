package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class LongestCommonPrefix {

    public static String getLongestPrefix(String [] words) {
        StringBuilder commonPrefix = new StringBuilder();
        if (words.length == 0) {
            return "";
        }
        for (int i = 0; i < words[0].length(); i++) {
            for (int j = 0; j < words.length - 1; j++) {
                boolean nextWordCharNotMatching = words[j+1].length() <= i || words[j].charAt(i) != words[j+1].charAt(i);
                if (nextWordCharNotMatching) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(words[0].charAt(i));
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String [] flStrings = {"float", "fling", "flat"};
        Assert.assertEquals("fl", getLongestPrefix(flStrings));
        Assert.assertNotEquals("fli", getLongestPrefix(flStrings));
        Assert.assertNotEquals("f", getLongestPrefix(flStrings));

        String [] abArray = {"ab", "a"};
        Assert.assertEquals("a", getLongestPrefix(abArray));

        String [] emptyStrings = {"float", "fling", "boat"};
        Assert.assertEquals("", getLongestPrefix(emptyStrings));

        String [] emptyArray = {};
        Assert.assertEquals("", getLongestPrefix(emptyArray));

        String [] shortToLongArray = {"ab", "abakus", "abanana"};
        Assert.assertEquals("ab", getLongestPrefix(shortToLongArray));

    }
}
