package pl.com.urbanlab.bootcamp.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CharacterTrimmerTest {

    private CharacterTrimmer trimmer;

    @Before
    public void setup() {
         trimmer = new CharacterTrimmer();
    }

    @Test
    public void testLeadingCharactersTrimmed() {
        Assert.assertEquals("123", trimmer.trim("123", "0"));
        Assert.assertEquals("123", trimmer.trim("0123", "0"));
        Assert.assertEquals("123", trimmer.trim("0000123", "0"));
    }

    @Test
    public void testTailingCharactersTrimmed() {
        Assert.assertEquals("123", trimmer.trim("1230", "0"));
        Assert.assertEquals("123", trimmer.trim("1230000", "0"));
        Assert.assertEquals("abc", trimmer.trim("xxabcxxx", "x"));
    }

    @Test
    public void testBothSidesCharactersTrimmed() {
        Assert.assertEquals("abc", trimmer.trim("xxabcxxx", "x"));
    }
}