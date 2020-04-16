package LeetCode001_100;

import java.util.Arrays;

public class LeetCode033_SearchRotatingSortArray {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 4, 3, 8 };
		int value = 4;
		System.out.println(search(nums, value));
	}

	public static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = (end - start) / 2 + start;
			if (nums[mid] == target)
				return mid;
			if (nums[start] < nums[mid]) {
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid;
				} else
					start = mid;

			} else {
				if (nums[mid] <= target && target <= nums[end]) {
					start = mid;
				}else end = mid;
			}
		}
		if(nums[start]==target) return start;
		if(nums[end]==target) return end;
		return -1;
	}

	public static int useList(int[] nums, int target) {
		int res = -1;
	    Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, target);
		if (index >= 0) {
			res = index;
			return res;
		} else
			return res;

	}

}
