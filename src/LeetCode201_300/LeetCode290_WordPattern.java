package LeetCode201_300;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode290_WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));

	}

	
	public static boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        char[] patterns = pattern.toCharArray();
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        if(strs.length!=patterns.length) return false;
        for(int i=0;i<patterns.length;i++) {
        	if(!map.containsKey(patterns[i])) {
        		if(set.add(strs[i])) {
        			map.put(patterns[i], strs[i]);
        		}else return false;
        	}else {
        		if(map.get(patterns[i]).equals(strs[i])) continue;
        		else return false;
        	}
        }
		return true;
    }
}
