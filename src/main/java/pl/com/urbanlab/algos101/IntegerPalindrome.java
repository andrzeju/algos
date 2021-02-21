package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class IntegerPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String stringifiedInt = Long.toString(x);
        int len = stringifiedInt.length();

        for (int i = 0; i < len/2; i++) {
            if (stringifiedInt.charAt(i) != stringifiedInt.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Assert.assertTrue(isPalindrome(121));
        Assert.assertTrue(isPalindrome(12321));
        Assert.assertTrue(isPalindrome(1));
        Assert.assertFalse(isPalindrome(123));
        Assert.assertFalse(isPalindrome(-121));
    }
}
