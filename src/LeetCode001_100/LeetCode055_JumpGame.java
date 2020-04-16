package LeetCode001_100;

public class LeetCode055_JumpGame {

	public static void main(String[] args) {
		int[] test1 = {2,3,1,1,4};
		int[] test2 = {3,2,1,0,4};
		System.out.println(canJump(test1));
		System.out.println(canJump(test2));

	}

	/*
	 * 如果最大步数max小于当前下标，那么一定是到不了最后一个数
	 */
	public static boolean canJump(int[] nums) {
		int max = 0;   //max是最大步数
		for(int i=0;i<nums.length;i++) {
			if(i>max) return false;
			max= Math.max(nums[i]+i, max);
			System.out.print(max+"  ");
		}
		return true;

	}

	/*
	 * 从后往前遍历数组，如果遇到的元素可以到达最后一行，则截断后边的元素。
	 * 否则继续往前，弱最后剩下的元素大于1个，则可以判断为假。否则就是真
	 */
	public static boolean canJump2(int[] nums) {
		int n=1;
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]>=n)
			{
				n=1;
			}
			else
			{
				n++;
			}
			if(i==0&&n>1)
			{
				return false;
			}
		}
		return true;

	}

}
