package LeetCode001_100;

import java.util.Arrays;

/**
 * 
 * 动态规划：最大子序列
 * 
 */
public class LeetCode053_MaxSubArray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = -2;
		for(int i=1;i<dp.length;i++) {
			if(dp[i-1]<0) dp[i] = nums[i];
			else dp[i] = dp[i-1]+nums[i];
		}
		Arrays.sort(dp);
		return dp[dp.length-1];
	}
}
