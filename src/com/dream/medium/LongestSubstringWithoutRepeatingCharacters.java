package com.dream.medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int i=0, j=0, max=0;
        Set<Character> set = new HashSet<>();

        while(i<len){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                max = Math.max(set.size(), max);
            }else{
                set.remove(s.charAt(j++));
            }
        }


        return max;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";

        int res = lengthOfLongestSubstring(s);

        System.out.println(res);
    }

}
