package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        return false;
    }

    public static void main(String[] args) {
        String valid1 = "[]";
        String valid2 = "{}()[]";
        String valid3 = "[{()}]";
        Assert.assertTrue("Single parentiesis are valid", isValid(valid1));
        Assert.assertTrue("Multiple parentiesis are valid", isValid(valid2));
        Assert.assertTrue("Nested parentiesis are valid", isValid(valid3));
        String invalid1 = "[}";
        Assert.assertFalse("Mixed parentiesis are invalid", isValid(invalid1));
    }
}
