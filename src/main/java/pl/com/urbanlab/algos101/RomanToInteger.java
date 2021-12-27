package pl.com.urbanlab.algos101;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<String, Integer> mapping = new HashMap<>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            boolean isLastChar = (i == s.length() - 1);

            if (isLastChar) {
                return sum + mapping.get(s.substring(i, i + 1));
            }
            String numberLiteral = s.substring(i, i + 2);

            if (mapping.containsKey(numberLiteral)) {
                sum += mapping.get(numberLiteral);
                i++;
            } else {
                sum += mapping.get(s.substring(i, i + 1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Assert.assertEquals(100, romanToInt("C"));
        Assert.assertEquals(4, romanToInt("IV"));
        Assert.assertEquals(58, romanToInt("LVIII"));
        Assert.assertEquals(900, romanToInt("CM"));
        Assert.assertEquals(1994, romanToInt("MCMXCIV"));
    }
}
