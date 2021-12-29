package pl.com.urbanlab.bootcamp.tasks;

import java.util.Arrays;

public class CharacterTrimmer {

    public String trim(String text, String stringCharToTrim) {
        char[] chars = text.toCharArray();
        char charTrimmed = stringCharToTrim.charAt(0);
        return String.valueOf(trimCharArray(chars, charTrimmed));
    }

    private char[] trimCharArray(char[] chars, char charTrimmed) {
        if (chars[0] == charTrimmed) {
            return trimCharArray(Arrays.copyOfRange(chars, 1, chars.length), charTrimmed);
        } else if (chars[chars.length - 1] == charTrimmed) {
            return trimCharArray(Arrays.copyOfRange(chars, 0, chars.length - 1), charTrimmed);
        }
        return chars;
    }
}
