package pl.com.urbanlab.bootcamp.tasks;

import org.junit.Assert;
import org.junit.Test;

public class PermutationDetectorTest {

    @Test
    public void testIsPermutation() {
        PermutationDetector detector = new PermutationDetector();
        Assert.assertTrue(detector.isPermutation("add", "dad"));
        Assert.assertTrue(detector.isPermutation("euqinu", "unique"));
        Assert.assertFalse(detector.isPermutation("xxccv", "abc1"));
    }

}