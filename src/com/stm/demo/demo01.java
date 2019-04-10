package com.stm.demo;

/**
 * Author STM
 * Create 4/4/19 4:07 PM
 */
public class demo01 {
    public static void main(String[] args) {
        int result = 0;
        int x = -2147483648;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                System.out.println("hello world");
            }
            result = newResult;
            x = x / 10;
        }

    }
}
