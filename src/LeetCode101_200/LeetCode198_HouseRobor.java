package LeetCode101_200;

public class LeetCode198_HouseRobor {

	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		int[] memo = new int[nums.length];
		for(int i = 0;i<memo.length;i++) {
			memo[i] =-1;
		}
		return tryRob(nums, 0,memo);
	}
	
	private static int tryRob(int[] nums,int index,int[] memo) {
		if(index>=nums.length) return 0;
		int res = 0;
		//利用memo数组记录已经计算过的答案，剪掉重复子问题
		if(memo[index]!=-1) {
			return memo[index];
		}
		for(int i=index;i<nums.length;i++) {
			res = Integer.max(res, nums[i]+tryRob(nums, i+2,memo));
		}
		memo[index] = res;
		return res;
	}
}
