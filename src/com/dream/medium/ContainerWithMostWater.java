package com.dream.medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(height);
        System.out.println(res);
    }

    public static int maxArea(int[] height) {
        int len = height.length;
        int max = 0, left = 0, right = len-1;
        while(left<right){
            int lefth = height[left], righth = height[right];
            int hei = Math.min(lefth,righth);
            int distance = Math.abs(left-right);
            max = Math.max(max,hei*distance);

            if(lefth < righth){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }

}
