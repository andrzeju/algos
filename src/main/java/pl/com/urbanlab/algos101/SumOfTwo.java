package pl.com.urbanlab.algos101;

import org.junit.Assert;

class SumOfTwo {

    private static final int[] NO_SOLUTION = {};

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return NO_SOLUTION;
    }

    public static void main(String[] args) {
        int[] numberArray = new int[]{2, 3, 5, 7, 8};
        Assert.assertArrayEquals("Number at indexes sum to target value", new int[]{2, 3}, twoSum(numberArray, 12));
    }

}
