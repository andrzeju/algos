package pl.com.urbanlab.bootcamp.tasks;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTrimmerTest {

    @Test
    public void testLeadingCharactersTrimmed() {
        CharacterTrimmer trimmer = new CharacterTrimmer();
        Assert.assertEquals("123", trimmer.trim("123", "0"));
        Assert.assertEquals("123", trimmer.trim("0123", "0"));
        Assert.assertEquals("123", trimmer.trim("0000123", "0"));
    }

    @Test
    public void testTailingCharactersTrimmed() {
        CharacterTrimmer trimmer = new CharacterTrimmer();
        Assert.assertEquals("123", trimmer.trim("1230", "0"));
        Assert.assertEquals("123", trimmer.trim("1230000", "0"));
        Assert.assertEquals("abc", trimmer.trim("xxabcxxx", "x"));
    }

    @Test
    public void testBothSidesCharactersTrimmed() {
        CharacterTrimmer trimmer = new CharacterTrimmer();
        Assert.assertEquals("abc", trimmer.trim("xxabcxxx", "x"));
    }
}