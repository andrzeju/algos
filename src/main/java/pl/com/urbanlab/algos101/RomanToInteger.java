package pl.com.urbanlab.algos101;

import org.junit.Assert;

public class RomanToInteger {

    public static int romanToInt(String s) {
        return 0;
    }


    public static void main(String[] args) {
        Assert.assertEquals(100, romanToInt("C"));
        Assert.assertEquals(4, romanToInt("IV"));
        Assert.assertEquals(58, romanToInt("LVIII"));
        Assert.assertEquals(900, romanToInt("CM"));
        Assert.assertEquals(1994, romanToInt("MCMXCIV"));
    }
}
