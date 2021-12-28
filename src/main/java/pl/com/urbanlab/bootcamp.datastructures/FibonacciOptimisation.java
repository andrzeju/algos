package pl.com.urbanlab.bootcamp.datastructures;

public class FibonacciOptimisation {

    private final Integer [] memoizedSequence = new Integer[1000];

    public int runStandardAlgo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return runStandardAlgo(n - 1) + runStandardAlgo(n - 2);
        }
    }

    public int runOptimizedAlgo(int n) {
        int result;
        if (n <= 0) {
            result =  0;
        } else if (n == 1) {
            result = 1;
        } else {
            Integer calculatedTwoBefore = memoizedSequence[n - 2];
            Integer calculatedOneBefore = memoizedSequence[n - 1];
            result = (calculatedOneBefore != null ? calculatedOneBefore : runOptimizedAlgo(n - 1))
                    + (calculatedTwoBefore != null ? calculatedTwoBefore : runOptimizedAlgo(n - 2));
        }

        memoizedSequence[n] = result;
        return result;
    }
}
