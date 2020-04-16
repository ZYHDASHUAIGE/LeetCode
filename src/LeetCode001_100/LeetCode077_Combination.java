package LeetCode001_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode077_Combination {

	public static void main(String[] args) {
		System.out.println(combine(4, 2));

	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if(n<=0||k<=0||k>n) {
			return res;
		}
		helper(n, k, list, res, 1);
		return res;
	}

	public static void helper(int n, int k, List<Integer> list, List<List<Integer>> res, int start) {
		if (list.size() == k) {
			res.add(new ArrayList<>(list));
			return;
		}

		for (int i = start; i <= n; i++) {
			list.add(i);
			//System.out.println(list);
			helper(n, k, list, res, i+1);
			list.remove(list.size()-1);
		}
	}

}
