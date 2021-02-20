package pl.com.urbanlab.algos101;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubustring {

    /** Length of a longest substring without repeating characters */
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        int j = 0;
        int stringLength = s.length();
        Set<Character> characterSet = new HashSet<>();

        while (i < stringLength && j < stringLength) {
            if (!characterSet.contains(s.charAt(j))){
                characterSet.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                characterSet.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Assert.assertEquals(3, lengthOfLongestSubstring("abcabc"));
        Assert.assertEquals(3, lengthOfLongestSubstring("abcbac"));
        Assert.assertEquals(1, lengthOfLongestSubstring("aaaa"));
        Assert.assertEquals(5, lengthOfLongestSubstring("ugghjklg"));
        Assert.assertEquals(3, lengthOfLongestSubstring("1112332211"));
    }
}
