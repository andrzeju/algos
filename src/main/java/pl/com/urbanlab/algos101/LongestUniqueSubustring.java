package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class LongestUniqueSubustring {

    /** Length of a longest substring without repeating characters */
    public static int lengthOfLongestSubstring(String s) {
        int longestSubstringLenght = 0;

        for (int i = 0; i < s.length(); i++) {
            int maxLength = substringMaxLength(s.substring(i));
            if (maxLength > longestSubstringLenght) {
                longestSubstringLenght = maxLength;
            }
        }

        return longestSubstringLenght;
    }

    private static int substringMaxLength(String s) {
        int substringMaxLength = 0;
        StringBuilder substring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (substring.indexOf(s.substring(i, i + 1)) != -1) {
                break;
            }
            substring.append(s.charAt(i));

            if (substring.length() > substringMaxLength) {
                substringMaxLength = substring.length();
            }
        }
        return substringMaxLength;
    }

    public static void main(String[] args) {
        Assert.assertEquals(3, lengthOfLongestSubstring("abcabc"));
        Assert.assertEquals(1, lengthOfLongestSubstring("aaaa"));
        Assert.assertEquals(5, lengthOfLongestSubstring("ugghjklg"));
        Assert.assertEquals(3, lengthOfLongestSubstring("1112332211"));
    }
}
