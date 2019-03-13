package com.dream.easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String revStr = String.valueOf(new StringBuilder(s).reverse());
        return s.equals(revStr);
    }

}
