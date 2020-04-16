package LeetCode201_300;

import java.util.HashSet;
import java.util.Set;

public class LeetCode219_ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums, 2));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
        	if(set.contains(nums[i])) return true;
        	else set.add(nums[i]);
        	if(set.size()>k) set.remove(nums[i-k]);
        }
        return false;
    }
}
