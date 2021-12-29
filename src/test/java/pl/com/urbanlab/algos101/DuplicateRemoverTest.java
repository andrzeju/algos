package pl.com.urbanlab.algos101;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateRemoverTest {

    @Test
    public void testDuplicatesRemoved() {
        DuplicateRemover remover = new DuplicateRemover();
        assertEquals(3, remover.removeDuplicates(new int[]{1, 2, 3, 3}));
        assertEquals(0, remover.removeDuplicates(new int[]{}));

        int[] duplicateValues = {-100, -43, -43, -3, -2, -2, 0, 0, 3, 4, 9, 9, 100};
        int uniqueNumberCount = remover.removeDuplicates(duplicateValues);
        assertEquals(9, uniqueNumberCount);

        int[] expectedValues = {-100, -43, -3, -2, 0, 3, 4, 9, 100};
        for (int i = 0; i < uniqueNumberCount; i++) {
            assertEquals(expectedValues[i], duplicateValues[i]);
        }
    }

    @Test
    public void testDuplicatesOverTwoRemoved() {
        DuplicateRemover remover = new DuplicateRemover();
        assertEquals(4, remover.removeDuplicatesOverTwo(new int[]{1, 2, 3, 3}));
        assertEquals(5, remover.removeDuplicatesOverTwo(new int[]{1,1,1,1,2,3,3,3,3}));

        int[] duplicateValues = {-10000, -43, -43, -3, -2, -2, 0, 0, 3, 4, 9, 9, 9, 10000};
        int uniqueNumberCount = remover.removeDuplicatesOverTwo(duplicateValues);
        assertEquals(13, uniqueNumberCount);

        int[] expectedValues = {-10000, -43, -43, -3, -2, -2, 0, 0, 3, 4, 9, 9, 10000};
        for (int i = 0; i < uniqueNumberCount; i++) {
            assertEquals(expectedValues[i], duplicateValues[i]);
        }
    }

}