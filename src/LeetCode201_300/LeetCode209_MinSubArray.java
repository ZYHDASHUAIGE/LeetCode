package LeetCode201_300;

public class LeetCode209_MinSubArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int s = 120;
		System.out.println(minSubArrayLen(s, nums));
		// System.out.println(sum(nums, 2, 4));
	}

	public static int minSubArrayLen(int s, int[] nums) {
		int i=0;
		int j = 0;
		int res = Integer.MAX_VALUE;
		while(j<nums.length&&i<nums.length&&i<=j) {
			if(sum(nums, i, j)<s) j++;
			else {
				res = Math.min(res, j-i+1);
				i++;
			}
		}
		if(sum(nums, 0, nums.length-1)<s) return 0;
		else return res;
	}

	public static int sum(int[] nums, int start, int end) {
		int res = 0;
		for (int i = start; i <= end; i++) {
			res += nums[i];
		}
		return res;
	}

}
