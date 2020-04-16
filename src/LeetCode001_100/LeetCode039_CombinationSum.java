package LeetCode001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode039_CombinationSum {

	public static void main(String[] args) {
		int[] candidates = {2,3,5};
		int target = 8;
		System.out.println(combinationSum(candidates, target));
		System.out.println(combinationSum2(candidates, target));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (candidates == null || candidates.length == 0)
			return res;
		helper(res, new ArrayList<Integer>(), candidates, target, 0);
		return res;
	}

	public static void helper(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int start) {
		if (target < 0) {
			return;
		}

		if (target == 0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = start; i < candidates.length; i++) {
			list.add(candidates[i]); //add本身就是一个判断，同样的元素不会重复add
			helper(res, list, candidates, target - candidates[i], i);  //本身就是一个循环
			System.out.println(list);
			list.remove(list.size() - 1);
			System.out.println(list);
		}

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> listAll = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		// 排序
		Arrays.sort(candidates);
		find(listAll, list, candidates, target, 0);
		return listAll;
	}

	public static void find(List<List<Integer>> listAll, List<Integer> tmp, int[] candidates, int target, int num) {
		// 递归的终点
		if (target == 0) {
			listAll.add(tmp);
			return;
		}
		if (target < candidates[0])
			return;
		for (int i = num; i < candidates.length && candidates[i] <= target; i++) {
			// 深拷贝
			List<Integer> list = new ArrayList<Integer>(tmp);
			list.add(candidates[i]);
			// 递归运算，将i传递至下一次运算是为了避免结果重复。
			find(listAll, list, candidates, target - candidates[i], i);
		}
	}
}
