package LeetCode001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode049_GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<List<String>>();
		if(strs==null||strs.length==0) {
			return res;
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String str:strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);  //排序后的字符串，这就是一个ID
			if(map.containsKey(s)) {
				List<String> list=res.get(map.get(s));  //判断往哪个list里面加
				list.add(str);
			}else {
				List<String> list= new ArrayList<String>();
				list.add(str);
				map.put(s, res.size());
				res.add(list);
			}
		}
		return res;

	}
}
