package LeetCode201_300;

public class LeetCode300_LongestIncreasingSubsequence {
	
	public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,101,18};
		for(int i:lengthOfLIS(nums)) {
			System.out.println(i);
		}
	}
	public static int[] lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
		for(int i = 0;i<dp.length-1;i++) {
			int step = 1;
			for(int j=0;j<nums.length;j=j+step) {
				if(nums[j]>nums[j+step]) {
					
				}
			}
		}
		
		
		return dp;
		
	}
}
