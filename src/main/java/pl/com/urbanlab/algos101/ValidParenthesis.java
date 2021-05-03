package pl.com.urbanlab.algos101;

import org.junit.Assert;

import java.util.Map;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        StringBuilder parenthesisStack = new StringBuilder();
        String opening = "{[(";
        Map<String, String> pairs = Map.ofEntries(
                Map.entry("}", "{"),
                Map.entry("]", "["),
                Map.entry(")", "(")
        );
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (opening.contains(currentChar)) {
                parenthesisStack.append(s.charAt(i));
            } else if (pairs.get(currentChar) != null && parenthesisStack.lastIndexOf(pairs.get(currentChar)) == parenthesisStack.length() -1){
                parenthesisStack.deleteCharAt(parenthesisStack.length() -1);
            } else {
                return false;
            }
        }
        return parenthesisStack.length() == 0;
    }

    public static void main(String[] args) {
        String valid1 = "[]";
        String valid2 = "{}()[]";
        String valid3 = "[{()}]()";
        Assert.assertTrue("Single parentiesis are valid", isValid(valid1));
        Assert.assertTrue("Multiple parentiesis are valid", isValid(valid2));
        Assert.assertTrue("Nested parentiesis are valid", isValid(valid3));
        String invalid1 = "[}";
        String invalid2 = "[43dfdfg}";
        Assert.assertFalse("Invalid chars are invalid", isValid(invalid2));
    }
}
