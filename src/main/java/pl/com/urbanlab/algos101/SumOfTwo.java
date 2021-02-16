package pl.com.urbanlab.algos101;

import org.junit.Assert;

import java.util.HashMap;

class SumOfTwo {

    private static final int[] NO_SOLUTION = {};

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numberIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int numberSearched = target - nums[i];
            if (numberIndex.containsKey(numberSearched)) {
                return new int[]{i, numberIndex.get(numberSearched)};
            }
        }
        return NO_SOLUTION;
    }

    public static void main(String[] args) {
        int[] numberArray = new int[]{2, 3, 5, 7, 8};
        Assert.assertArrayEquals("Number at indexes sum to target value", new int[]{2, 3}, twoSum(numberArray, 12));
    }

}
