package LeetCode001_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode046_Premutations {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}

	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums==null||nums.length==0) return res;
		helper(nums, res, new ArrayList<Integer>());
		return res;
	}

	/**
	 *
	 * @param nums:
	 * @param res:总结果集
	 * @param list:
	 */
	public static void helper(int[] nums,List<List<Integer>> res,List<Integer> list) {
		if(list.size()==nums.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(list.contains(nums[i])) continue;
			list.add(nums[i]);

			helper(nums, res, list);
			list.remove(list.size()-1);  //去掉当前尝试的值

		}
	}
}
