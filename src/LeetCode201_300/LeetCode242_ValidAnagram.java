package LeetCode201_300;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242_ValidAnagram {
	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++) {
        	if(!map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), 1);
        	}else {
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}
        }
        for(int i=0;i<t.length();i++) {
        	if(map.containsKey(t.charAt(i))) {
        		map.put(t.charAt(i), map.get(t.charAt(i))-1);
        		if(map.get(t.charAt(i))==0) map.remove(t.charAt(i));
        	}else {
        		return false;
        	}
        }
		return true;
    }
}
