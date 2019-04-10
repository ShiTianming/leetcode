package com.stm.demo7;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -2147483648;
        int res = reverse(x);
        System.out.println(res);
    }

    private static int reverse(int x) {
        boolean flag = false;
        char[] oldChars = Integer.toString(x).toCharArray();
        int n = oldChars.length;
        if (x < 0) {
            n = oldChars.length - 1;
            flag = true;
        }
        char[] newChars = new char[n];
        for (int i = 0; i < n; i++) {
            newChars[i] = oldChars[oldChars.length - 1 - i];
        }
        double y = Double.parseDouble(new String(newChars));
        y = flag ? -y : y;
        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) return 0;
        return (int) y;
    }
}