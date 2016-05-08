package com.demo;

/**
 * Created by xb on 2016/5/8.
 */
public class TwoSum {

    public int[] solution(int[] nums, int target){
        int[] result = new int[2];
        for (int i=0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target =9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.solution(nums,target);
        for (int i =0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
