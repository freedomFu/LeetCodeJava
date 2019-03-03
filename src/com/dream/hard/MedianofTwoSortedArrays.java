package com.dream.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double x = findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            l1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            l2.add(nums2[i]);
        }
        l1.addAll(l2);
        Collections.sort(l1);
        int len = l1.size();
        if(len%2==0){
            int index = len/2;
            int sum = l1.get(index)+l1.get(index-1);
            return (sum%2==0)?(sum/2):((double)sum/2);
        }else{
            int index = (len-1)/2;
            return (l1.get(index));
        }
    }

}
