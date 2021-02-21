package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class IntegerPalindrome {
    public static boolean isPalindrome(int x) {
        return false;
    }

    public static void main(String[] args) {
        Assert.assertTrue(isPalindrome(121));
        Assert.assertTrue(isPalindrome(12321));
        Assert.assertTrue(isPalindrome(1));
        Assert.assertFalse(isPalindrome(123));
        Assert.assertFalse(isPalindrome(-121));
    }
}
