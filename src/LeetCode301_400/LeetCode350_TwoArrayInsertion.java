package LeetCode301_400;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LeetCode350_TwoArrayInsertion {

	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num:nums1) {
        	if(!map.containsKey(num)) {
        		map.put(num, 1);
        	}else {
        		map.put(num, map.get(num)+1);
        	}
        }
        
        for(int num:nums2) {
        	if(map.containsKey(num)) {
        		list.add(num);
        		map.put(num, map.get(num)-1);
        		if(map.get(num)==0) {
        			map.remove(num);
        		}
        	}
        }
        
        Object[] a=list.toArray();
        int[] res= new int[a.length];
        for(int i=0;i<res.length;i++) {
        	res[i] = (int) a[i];
        }
        return res;
    }
}
