package LeetCode001_100;

import java.util.HashMap;
import java.util.Map;

public class LeetCode001_TwoSum {
public static void main(String[] args) {
	int[] nums= {1,2,7,11,15};
	int target = 9;
	for(int a:twoSum(nums, target)) {
		System.out.print(a+" ");
	}
}
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res= new int[2];
        
        for(int i =0;i<nums.length;i++) {
        	int com = target-nums[i];
        	if(map.containsKey(com)) {
        		res[0]=map.get(com);
        		res[1]=i;
        	}else {
        		map.put(nums[i], i);
        	}
        }
        
        return res;
    }
}
