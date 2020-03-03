package com.main;

public class Main {
	
	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5};
		
		System.out.println("Max sub-array of "+java.util.Arrays.toString(nums)+" is "+maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int  curSum = nums[0];
		int  maxSum = nums[0];
		
		for(int i = 1; i <nums.length; i++) {
			curSum = Math.max(nums[i], curSum + nums[i]);
			maxSum = Math.max(maxSum, curSum);
		}
		
		return maxSum;
	}
}
