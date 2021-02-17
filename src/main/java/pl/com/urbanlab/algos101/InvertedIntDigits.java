package pl.com.urbanlab.algos101;

import static org.junit.Assert.assertEquals;

public class InvertedIntDigits {

    public static int reverse(int x) {
        String stringifiedInt = Integer.toString(x);
        StringBuilder reverseStringifiedInt = new StringBuilder();
        int lastCharAt = stringifiedInt.length() - 1;

        for (int i = 0; i < stringifiedInt.length(); i++) {
            reverseStringifiedInt.append(stringifiedInt.charAt(lastCharAt - i));
        }

        if (x<0) {
            reverseStringifiedInt.deleteCharAt(reverseStringifiedInt.length() - 1);
            reverseStringifiedInt.insert(0,"-");
        }

        long tempIntStore = Long.parseLong(reverseStringifiedInt.toString()); //assuming that smaller than max long
        if (tempIntStore > Integer.MAX_VALUE || tempIntStore < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.parseInt(reverseStringifiedInt.toString());

    }

    public static void main(String[] args) {
        assertEquals("int digits are reverted", 4321, reverse(1234));
        assertEquals("zero when over max value", 0, reverse(2_147_483_647));
        assertEquals("zero when under min value", 0, reverse(-2_147_483_648));
        assertEquals("zero when under min value", -543, reverse(-345));
    }
}
