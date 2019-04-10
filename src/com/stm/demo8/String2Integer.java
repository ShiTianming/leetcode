package com.stm.demo8;

/**
 * Author STM
 * Create 4/4/19 5:09 PM
 */
public class String2Integer {
    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }

    private static int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;

        // 1. Empty string
        if (str.length() == 0) return 0;

        // 2. Remove space
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        if (index == str.length()) {
            return 0;
        }

        // 3. Handle signs
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // 4. Convert number and avoid overflow
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;

            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }
}
