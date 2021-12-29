package pl.com.urbanlab.algos101;

public class DuplicateRemover {

    private static final int POSITIVE_ARRAY_OFFSET = 100;
    private static final int POSITIVE_ARRAY_OFFSET_LARGE = 10000;

    public int removeDuplicates(int[] nums) {
        boolean[] exists = new boolean[201];
        int countingPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumberArrayPointer = nums[i] + POSITIVE_ARRAY_OFFSET;
            if (!exists[currentNumberArrayPointer]) {
                exists[currentNumberArrayPointer] = true;
                nums[countingPointer] = nums[i];
                countingPointer++;
            }
        }
        return countingPointer;
    }

    public int removeDuplicatesOverTwo(int[] nums) {
        int[] existsTimes = new int[20001];
        int countingPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumberArrayPointer = nums[i] + POSITIVE_ARRAY_OFFSET_LARGE;
            if (existsTimes[currentNumberArrayPointer] < 2) {
                existsTimes[currentNumberArrayPointer]++;
                nums[countingPointer] = nums[i];
                countingPointer++;
            }
        }
        return countingPointer;
    }
}
