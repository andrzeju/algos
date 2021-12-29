package pl.com.urbanlab.bootcamp.tasks;

import java.util.Arrays;

public class PermutationDetector {

    public boolean isPermutation(String text, String comparedText) {
        if (text.length() != comparedText.length()) {
            return false;
        }

        return sort(text).equals(sort(comparedText));
    }

    private String sort(String comparedText) {
        char[] charArray = comparedText.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
