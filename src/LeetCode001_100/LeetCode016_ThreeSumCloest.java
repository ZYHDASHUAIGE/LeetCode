package LeetCode001_100;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class LeetCode016_ThreeSumCloest {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		int res = threeSumClosest(nums, target);
		System.out.println(res);
	}
	
	public static int threeSumClosest(int[] nums, int target) {
		if(nums==null||nums.length==0) return 0;
		Arrays.sort(nums);
		int result = Integer.MAX_VALUE;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length-2;i++) {
			int low = i+1;
			int high = nums.length-1;
			while(low<high) {
			    result = nums[i]+nums[low]+nums[high];
				int abso = Math.abs(target-result);
				hm.put(abso, result);
				if(result<target) {
					low++;
				}
				else if(result>target){
					high--;
				}
				else if(result==target) {
					return result;
				}
			}
		}
		Collection<Integer> a = hm.keySet();
		Object[] b=a.toArray();
		Arrays.sort(b);
		result = hm.get(b[0]);
		return result;

	}
}
