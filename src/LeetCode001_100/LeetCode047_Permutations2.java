package LeetCode001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode047_Permutations2 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		System.out.println(permuteUnique(nums));
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0)
			return res;
		Arrays.sort(nums);
		helper(nums, res, 0);
		return res;
	}

	public static void helper(int[] nums, List<List<Integer>> res, int start) {
		if (start == nums.length) {
			List<Integer> list = new ArrayList<Integer>();
			for (int num : nums) {
				list.add(num);
			}
			res.add(list);
			return;
		}
		for (int i = start; i < nums.length; i++) {
			if(isUsed(nums, start, i)) {
				continue;
			}
			swap(nums, start, i);
			helper(nums, res, start+1);
			swap(nums, start, i);			
		}
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static boolean isUsed(int[] nums, int i, int j) {
		for (int x = i; x < j; x++) {
			if (nums[x] == nums[j])
				return true;
		}
		return false;
	}

}
