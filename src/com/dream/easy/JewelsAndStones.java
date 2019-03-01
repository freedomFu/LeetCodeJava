package com.dream.easy;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }

    public static int numJewelsInStones(String J, String S) {
        char[] s = S.toCharArray();
        int num = 0, len = s.length;

        for(int i=0;i<len;i++){
            String x = String.valueOf(s[i]);
            if(J.indexOf(x)!=-1){
                num++;
            }else{
                continue;
            }
        }

        return num;
    }

}
