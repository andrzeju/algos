package pl.com.urbanlab.bootcamp.datastructures;

public class FibonacciOptimisation {

    public int runStandardAlgo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return runStandardAlgo(n - 1) + runStandardAlgo(n - 2);
    }
}
