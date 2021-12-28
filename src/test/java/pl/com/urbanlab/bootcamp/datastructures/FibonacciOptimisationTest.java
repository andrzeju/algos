package pl.com.urbanlab.bootcamp.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciOptimisationTest {

    @Test
    public void testStandardFiboSpeed() {
        FibonacciOptimisation fiboOptimised = new FibonacciOptimisation();

        long startTime = System.nanoTime();
        Assert.assertEquals("10th fibo", 55, fiboOptimised.runStandardAlgo(10));
        long endTime = System.nanoTime();
        System.out.println("Time taken:" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        Assert.assertEquals("20th fibo", 1134903170, fiboOptimised.runStandardAlgo(45));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken [ms]:" + (endTime - startTime));

    }

    @Test
    public void testOptimisedFiboSpeed() {
        FibonacciOptimisation fiboOptimised = new FibonacciOptimisation();

        long startTime = System.nanoTime();
        Assert.assertEquals("10th fibo", 55, fiboOptimised.runOptimizedAlgo(10));
        long endTime = System.nanoTime();
        System.out.println("Time taken:" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        Assert.assertEquals("20th fibo", 1134903170, fiboOptimised.runOptimizedAlgo(45));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken [ms]:" + (endTime - startTime));

    }

}