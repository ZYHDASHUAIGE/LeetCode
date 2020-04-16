package LeetCode401_500;

import java.util.HashMap;
import java.util.Map;

public class LeetCode454_FourSum {

	public static void main(String[] args) {
		int[] A = {-1, -1};
		int[] B = {-1, 1};
		int[] C = {-1, 1};
		int[] D = {1, -1};
		
		System.out.println(fourSumCount(A, B, C, D));
		
		
	}
	
	
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		//key=sum,value=多少种组合
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<C.length;i++) {
			for(int j=0;j<D.length;j++) {
				if(!map.containsKey(C[i]+D[j])) {
					map.put(C[i]+D[j], 1);
				}else {
					map.put(C[i]+D[j], map.get(C[i]+D[j])+1);
				}
			}
		}
		
		int res = 0;
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B.length;j++) {
				int cur = A[i]+B[j];
				if(map.containsKey(-cur)) {
					res+=map.get(-cur);
					
				}else continue;
			}
		}
		
		return res;
        
    }
}
