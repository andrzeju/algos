package pl.com.urbanlab.algos101;

import static org.junit.Assert.assertEquals;

public class InvertedIntDigits {

    public static int reverse(int x) {

        if (x == Integer.MIN_VALUE) { //Math.abs doesn't work for MIN_VALUE
            return 0;
        }

        StringBuilder stringifiedInt = new StringBuilder(Integer.toString(Math.abs(x)));
        stringifiedInt.reverse();

        if (x<0) {
            stringifiedInt.insert(0, "-");
        }

        long result = Long.parseLong(stringifiedInt.toString());
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;

    }

    public static void main(String[] args) {
        assertEquals("int digits are reverted", 4321, reverse(1234));
        assertEquals("zero when over max value", 0, reverse(2_147_483_647));
        assertEquals("zero when under min value", 0, reverse(-2_147_483_648));
        assertEquals("zero when under min value", 0, reverse(-2_147_483_647));
        assertEquals("zero when under min value", -543, reverse(-345));
    }
}
