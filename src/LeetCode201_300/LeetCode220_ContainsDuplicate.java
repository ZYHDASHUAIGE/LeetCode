package LeetCode201_300;

import java.util.Set;
import java.util.TreeSet;

public class LeetCode220_ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {0,Integer.MAX_VALUE};
		int k=1;
		int t=Integer.MAX_VALUE;
		System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
		
	}
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++) {
        	//System.out.println(inSet((TreeSet<Integer>) set, nums[i]-t, nums[i]+t));
        	long l=nums[i]-t;
        	long r = nums[i]+t;
        	System.out.print(l+" "+r);
        	System.out.println();
        	System.out.print((int)Math.ceil(l));
        	if(set.contains((int)Math.ceil(l))&&Math.ceil(l)<=r) {
        		return true;
        	}else set.add(nums[i]);
        	if(set.size()>k) set.remove(nums[i-k]);
        }
		
        return false;
    }
	
	
}
