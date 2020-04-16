package LeetCode001_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode017_PhoneNumber {

	public static void main(String[] args) {
		System.out.println(letterCombinations1(""));

	}

	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();

		findCombnation(digits.toCharArray(), 0, "", list);
		return list;
	}

	private static void findCombnation(char[] digitals,int index, String s,List<String> list) {
		final String[] letters = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		if(index==digitals.length) {
			list.add(s);
			return;
		}
		char c = digitals[index];
		String letter = letters[c-'0'];
		for(int i=0;i<letter.length();i++) {
			findCombnation(digitals, index+1, s+letter.substring(i, i+1), list);

		}
		return;

	}

	public static List<String> letterCombinations1(String digits) {
		List<String> result = new ArrayList<String>();
		String[] numbers = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String[] temp = new String[digits.length()]; // 被选中的字符串
		if(digits==null||digits.length()==0) return result;
		for (int i = 0; i < digits.length(); i++) {
			temp[i] = numbers[Integer.parseInt(Character.toString(digits.charAt(i))) - 2];
		}
		String[] res=  strTo(temp);
		for(int i=0;i<res.length;i++) {
			result.add(res[i]);
		}
		return result;

	}

	public static String[] strTo(String[] str) {
		int length = str.length;
		List<String> charTemp = new ArrayList<String>();
		List<String> addAfter = new ArrayList<String>(); // 覆盖更新
		List<String> add1 = new ArrayList<String>();
		String[] res = null;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				charTemp.add(Character.toString(str[i].charAt(j)));
			}
		}
		if (str.length == 1) {
			String[] a = new String[charTemp.size()];
			res = charTemp.toArray(a);
			return res;
		}
		for (int i = 0; i < charTemp.size() - 1; i++) {
			for (int j = i + 1; j < charTemp.size(); j++) {
				addAfter.add(charTemp.get(i) + charTemp.get(j));
			}
		}
		if (str.length == 2) {
			String[] a = new String[addAfter.size()];
			res = addAfter.toArray(a);
			return res;
		}
		if (str.length > 2) {
			while (length > 2) {
				for (int i = 0; i < addAfter.size(); i++) {
					for (int j = 0; j < charTemp.size(); j++) {
						CharSequence cs = charTemp.get(j);
						if (addAfter.get(i).contains(cs.toString()))
							continue;
						add1.add(addAfter.get(i) + charTemp.get(j));
					}

				}
				addAfter.removeAll(addAfter);
				addAfter.addAll(add1);
				add1.removeAll(add1);
				length--;
			}

			String[] a = new String[addAfter.size()];
			res = addAfter.toArray(a);
			return res;

		}
		return res;

	}

}
