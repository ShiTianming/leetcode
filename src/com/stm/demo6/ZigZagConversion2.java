package com.stm.demo6;

public class ZigZagConversion2 {
    
    public static void main(String[]args) {
        System.out.println(convert("helloworldthisisamessage", 4));
    }
    
    private static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int i = 0;
        while(i < length) {
            for(int idx = 0; idx < numRows && i < length; idx++) {
                sbs[idx].append(chars[i++]);
            }
            for(int idx = numRows - 2; 0 < idx && i < length; idx--) {
                sbs[idx].append(chars[i++]);
            }
        }
        for(int j = 1; j < numRows; j++) {
            sbs[0].append(sbs[j]);
        }
        return sbs[0].toString();
    }

}