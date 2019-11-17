package com.dream.hard;

public class RegularExpressionMatching {

    public static void main(String[] args) {
        System.out.println(isMatch("a","aa"));
    }

    public static boolean isMatch(String s, String p) {
        if(!(p.contains(".")||p.contains("*"))){
            if(p.equals(s)){
                return true;
            }
        }
        return false;
    }

}
