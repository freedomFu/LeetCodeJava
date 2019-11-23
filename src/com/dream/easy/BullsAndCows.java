package com.dream.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0, stats[] = new int[10], s, g;
        for(int i=0; i<secret.length(); i++) {
            s = secret.charAt(i)-'0';
            g = guess.charAt(i)-'0';
            if(s == g) bulls++;
            else {
                if(stats[s]++ < 0) cows++;
                if(stats[g]-- > 0) cows++;
            }
        }
        return bulls+"A"+cows+"B";
    }
    /*public String getHint(String secret, String guess){
        int aNum = getA(secret,guess);
        int bNum = getB(secret,guess);
        bNum = bNum-aNum;
        return ""+aNum+"A"+bNum+"B";
    }*/
    // 计算得到A
    private int getA(String secret, String guess){
        int len = secret.length();
        int count = 0;
        for(int i=0;i<len;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                count++;
            }
        }
        return count;
    }

    // 计算得到B
    private int getB(String secret, String guess){
        int count = 0;
        int len = secret.length();
        ArrayList<Character> gList = new ArrayList<>();
        for(int i=0;i<len;i++){
            gList.add(guess.charAt(i));
        }
        for(int i=0;i<len;i++){
            char tmp = secret.charAt(i);
            if(gList.contains(tmp)){

                count++;
            }
        }
        return count;
    }
    // 去除字符串中的重复字符 用set即可
    private String getClean(String old){
        Set<Character> newSet = new HashSet<>();
        for(char item:old.toCharArray()){
            newSet.add(item);
        }
        Object[] newArray = newSet.toArray();
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<newArray.length;i++){
            newStr.append(newArray[i]);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        System.out.println(new BullsAndCows().getHint(secret,guess));
    }
}
