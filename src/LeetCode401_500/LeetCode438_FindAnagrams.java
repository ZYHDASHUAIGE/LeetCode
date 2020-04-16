package LeetCode401_500;

import java.util.*;

public class LeetCode438_FindAnagrams {

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p ="abc";
		for(Integer a:findAnagrams(s, p)) {
			System.out.print(a+" ");
		}
		//System.out.println(isAnagrams(p, "cba"));
		

	}

	
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		
		int l=0;
	
		while(l+p.length()-1<s.length()) {
			if(isAnagrams(p, s.substring(l, l+p.length()))) {
				list.add(l);
			}
			l++;
		}
		
		
		return list;
        
    }
	
	public static boolean isAnagrams(String p,String subs) {
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for(int i=0;i<p.length();i++) {
			freq1[p.charAt(i)-'a']++;
		}
		for(int i=0;i<subs.length();i++) {
			freq2[subs.charAt(i)-'a']++;
		}
		if(Arrays.equals(freq1, freq2)) return true;
		else return false;
 	}
}
