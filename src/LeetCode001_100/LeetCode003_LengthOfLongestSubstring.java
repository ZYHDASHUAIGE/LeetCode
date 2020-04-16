package LeetCode001_100;

import java.util.HashMap;
import java.util.HashSet;



/**
 * KMP�㷨ʵ��
 * @author Administrator
 *
 */

public class LeetCode003_LengthOfLongestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
//		//System.out.println(lengthOfLongestSubstring(s));
//        //System.out.println(lengthOfLongestSubstring_HashSet(s));
//		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
//		for(int i=0;i<s.length();i++) {
//			if(m.containsKey(s.charAt(i))) {
//				System.out.println(m.get(s.charAt(i)));
//			}
//			m.put(s.charAt(i), i);
//		}
		System.out.println(demo(s));
        
	}
	
	public static int lengthOfLongestSubstring(String s) {
		if(s==null||s.length()==0) {
			return 0;
		}
		int result =0;
		HashMap<Character, Integer> map =new HashMap<Character,Integer>(); 
		for(int i=0,j=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				 j=Math.max(j, map.get(s.charAt(i))+1);				
			}//  ���ʱ��ǰֵ��û�м���map���ж���put֮ǰ
			map.put(s.charAt(i), i);
			result=Math.max(result, i+1-j);
		}

		return result;
	}
	
	public static int lengthOfLongestSubstring_HashSet(String s) {
		if(s==null||s.length()==0) {
			return 0;
		}
		HashSet<Character> set =new HashSet<Character>();
		int result=0;
		for(int i=0,j=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				set.remove(s.charAt(j));
			}else {
				set.add(s.charAt(i));
				result=Math.max(result,set.size());
			}
		}
		return result;
	}
	

	public static int demo(String s) {
		int[] freq = new int[256];    //ASCII��ӳ��
		int l=0,r=-1;
		int res = 0;
		
		while(l<s.length()) {
			//���ж���һ���ַ��Ƿ���ֹ���û�г��ֹ����ٽ���ָ�����ƣ�����Ƶ��ֵ
			if(r+1<s.length()&&freq[s.charAt(r+1)]==0) {
				r++;
				freq[(int)s.charAt(r)]++;
			}
			//������drop�ظ�Ԫ�ص�Ƶ�ʣ���ָ��������
			else {
				freq[(int)(s.charAt(l))]--;
				l++;
			}
			
			res = Math.max(res, r-l+1);
		}
		
		return res;
	}
}
