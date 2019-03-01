package com.dream.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        int len = nums.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                int left = map.get(nums[i]);
                return new int[]{left, i};
            }else {
                map.put(target-nums[i], i);
            }
        }

        return new int[2];

    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 14;
        TwoSum ts = new TwoSum();
        int[] arr = ts.twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
    }

}
