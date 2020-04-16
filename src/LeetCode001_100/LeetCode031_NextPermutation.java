package LeetCode01_100;

public class LeetCode031_NextPermutation {

	public static void main(String[] args) {
		int[] nums= {1,6,5,4};
		nextPermutation(nums);
		for(int s:nums) {
			System.out.print(s+" ");
		}

	}

	public static void nextPermutation(int[] nums) {
		if(nums==null||nums.length==0) return;
		int firstSmall =-1;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				firstSmall = i;
				break;
			}
		}

		/*
		 * 经过循环后，firstSmall依然是-1，说明后一个数永远比前一个数小
		 * 此时之间翻转排序
		 */
		if(firstSmall==-1) {
			reverse(nums, 0, nums.length-1);
			return;
		}

		int firstLarge=-1;
		for(int i=nums.length-1;i>firstSmall;i--) {
			if(nums[i]>nums[firstSmall]) {
				firstLarge=i;
				break;
			}
		}
		swap(nums, firstSmall, firstLarge); //4651
		reverse(nums, firstSmall+1, nums.length-1); //  4156
		return;
	}

	public static void reverse(int[] nums,int i,int j) {
		while(i<j) {
			swap(nums, i++, j--);
		}
	}

	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i++]=nums[j];
		nums[j--]=temp;
	}

}
