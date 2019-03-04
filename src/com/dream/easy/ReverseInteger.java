package com.dream.easy;

public class ReverseInteger {

    public static void main(String[] args) {
        int x = 123;
        int res = reverse(x);
        System.out.println(res);
    }

    public static int reverse(int x) {
        long r=0;

        while(x!=0){
            r = r*10 + x%10;
            x = x/10;
        }

        int res = (r>Integer.MAX_VALUE || r<Integer.MIN_VALUE)?0:(int)r;
        return res;
    }

}
