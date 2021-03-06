package LeetCode001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode018_FourSum {

	public static void main(String[] args) {
		int[] nums = {1,0,-1, 0,-2,2};
		LeetCode018_FourSum a = new LeetCode018_FourSum();
		System.out.println(a.fourSum(nums, 0));

	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int n = nums.length;
		if(n < 4) {
			return res;
		}
		int t, tt, f, l;
		for(int i = 0; i < n - 3; i++) {
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			t = target - nums[i];
			for(int j = i + 1; j < n -2; j++) {
				tt = t - nums[j];
				if(j > i + 1 && nums[j] == nums[j-1]) {
					continue;
				}
				f = j + 1;
				l = n - 1;
				while(f < l) {
					if(nums[f] + nums[l] == tt) {
						List<Integer> li = new ArrayList<Integer>();
						li.add(nums[i]);
						li.add(nums[j]);
						li.add(nums[f]);
						li.add(nums[l]);
						res.add(li);
						while(f < l && nums[f] == nums[f+1]) {
							f++;
						}
						f++;
						l--;
					}else if(nums[f] + nums[l] < tt) {
						f++;
					}else {
						l--;
					}
				}
			}
		}
		return res;

	}
}
