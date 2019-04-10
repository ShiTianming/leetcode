package com.stm.palindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome2(101));
    }
    
    private static boolean isPalindrome(int x) {
        char[] chars = (x+"").toCharArray();
        if(chars.length == 1) return true;
        int i = 0;
        while( i < chars.length / 2) {
            if(chars[i] != chars[chars.length-i-1]) return false;
            i++;
        }
        return true;
    }

    private static boolean isPalindrome2(int x) {
        String str = Integer.toString(x);
        String reverse = new StringBuffer(str).reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }
}