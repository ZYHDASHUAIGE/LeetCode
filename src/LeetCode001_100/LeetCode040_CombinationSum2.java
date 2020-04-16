package LeetCode001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode040_CombinationSum2 {

	public static void main(String[] args) {
		int[] candidates= {10,1,2,7,6,1,5};
		int target = 8;
		System.out.println(combinationSum2(candidates, target));
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(candidates==null||candidates.length==0) return res;
		Arrays.sort(candidates);
		helper(res, candidates, new ArrayList<Integer>(), target, 0);
		return res;

	}
	
	public static void helper(List<List<Integer>> res,int[] candidates,List<Integer> list,int target,int start) {
		if(target<0) return;
		if(target==0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=start;i<candidates.length;i++) {
			if(i!=start&&candidates[i]==candidates[i-1]) continue;
			list.add(candidates[i]);
			helper(res, candidates, list, target-candidates[i], i+1);
			list.remove(list.size()-1);
		}
	}
}
