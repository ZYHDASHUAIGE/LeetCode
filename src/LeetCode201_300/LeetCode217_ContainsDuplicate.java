package LeetCode201_300;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217_ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
        	if(set.add(nums[i])) continue;
        	else return true;
        }
        return false;
    }
}
