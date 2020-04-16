package LeetCode001_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode060_PermutionSequence {

	public static void main(String[] args) {
		

	}
	
	public static String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder();
		List<Integer> candidates = new ArrayList<Integer>();
		int[] factorials = new int[n+1];
		int fact = 1;
		factorials[0] = 1;
		for(int i = 1;i<=n;++i) {
			candidates.add(i);
			fact*=i;
			factorials[i] = fact;
		}
		k -=1;
		for(int i = n-1;i>=0;--i) {
			int index  = k/factorials[i];
			sb.append(candidates.remove(index));
			k-=index*factorials[i];
		}
		return sb.toString();
	}

}
