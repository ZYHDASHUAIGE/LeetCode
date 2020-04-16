package LeetCode301_400;

import java.util.HashSet;
import java.util.Set;

public class LeetCode349_TwoArrayIntersection {

	public static int[] intersection(int[] nums1, int[] nums2) {
        Object[] input = intersection1(nums1, nums2);
		
		int[] res = new int[input.length];
		for(int i=0;i<res.length;i++) {
			res[i] = (int) input[i];
		}
		return res;
    }
    
    private static Object[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++) {
        	for(int j=0;j<nums2.length;j++) {
        		if(nums1[i]==nums2[j]) {
        			set.add(nums1[i]);
        		}
        	}
        }
        
        Object[] res = set.toArray(); 
        return res;
    }
}
