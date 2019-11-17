package com.dream.medium;

import java.util.Arrays;

public class IntegertoRoman {

    public static void main(String[] args) {
        int num = 1994;
        String res = intToRoman(num);
        System.out.println(res);
    }

    public static String intToRoman(int num) {
        int[] fourNum = {num/1000, (num%1000)/100, (num%100)/10, num%10};
        // 个十百千
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String M[] = {"", "M", "MM", "MMM"};

        return M[fourNum[0]]+C[fourNum[1]]+X[fourNum[2]]+I[fourNum[3]];
    }

}
