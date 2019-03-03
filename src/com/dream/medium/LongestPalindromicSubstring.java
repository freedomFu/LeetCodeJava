package com.dream.medium;

import java.util.*;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "abba";
        String res = longestPalindrome(s);
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        if(s.equals("")){
            return "";
        }

        int len = s.length();
        Map<Integer,String> map = new HashMap<>();

        for(int i=0;i<len;i++){
            String ele = String.valueOf(s.charAt(i));
            Object[] indexArr = indexArr(ele, s, i);
            int isize = indexArr.length;
            for(int j=1;j<isize;j++){
                String pali = s.substring(i,(Integer) indexArr[j]+1);
                if(isReverse(pali)){
                    map.put(pali.length(), pali);
                }
            }
        }

        if(map.isEmpty()){
            return String.valueOf(s.charAt(0));
        }else{
            Set<Integer> set = map.keySet();
            int max = Collections.max(set);
            String res = map.get(max);
            return res;
        }
    }

    public static boolean isReverse(String s){
        StringBuilder start = new StringBuilder(s);
        String reverse = String.valueOf(start.reverse());

        return s.equals(reverse);
    }

    public static Object[] indexArr(String ele, String s, int now){
        int len = s.length();
        List<Integer> list = new ArrayList<>();
        int first = s.indexOf(ele, now);
        list.add(first);
        for(int i=first+1;i<len;){
            int index = s.indexOf(ele, i);
            if(index!=-1){
                list.add(index);
                i = index+1;
            }else{
                break;
            }
        }
        return  list.toArray();
    }

}
