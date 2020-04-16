package LeetCode001_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode022_GenerateParenthesis {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));

	}

	public static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		if(n==0) return res;
		helper(res, "", n, n);
		return res;
	}

	//左括号数永远大于右括号数
	public static void helper(List<String> res,String s,int left,int right) {
		if(left>right) return;
		if(left==0&&right==0) {
			res.add(s);
			return;
		}
		if(left>0) {
			helper(res, s+"(", left-1, right);
		}
		if(right>0) {
			helper(res, s+")", left, right-1);
		}
	}
}
