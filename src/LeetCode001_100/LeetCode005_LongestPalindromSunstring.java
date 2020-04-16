package LeetCode001_100;


/**
 * ��̬�滮
 * ����¼��ʽ����̬�滮����dp[][]
 * @author Administrator
 *
 */
public class LeetCode005_LongestPalindromSunstring {

	public static void main(String[] args) {
		String s="abbc";
		System.out.println(longestPalindrome(s));
		System.out.println(longestPalindrome2(s));
	}
	
	public static String longestPalindrome(String s) {
		if(s==null||s.length()==0) {
			return "error";
		}
		String result = "";
		boolean[][] dp= new boolean[s.length()][s.length()];
		int max=0;
		for(int j = 0;j<s.length();j++) {
			for(int i=0;i<=j;i++) {
				dp[i][j]=  s.charAt(i)==s.charAt(j)&&((j-i)<=2||dp[i+1][j-1]);
				if(dp[i][j]) {
					if(j-i+1>max) {
						max=j-i+1;
						result=s.substring(i, j+1);
					}
				}
			}
		}
          return result;        
	}
	
	 static String res= "";
	
	public static String longestPalindrome2(String s) {
		if(s==null||s.length()==0) {
			return "";
		}
		for(int i=0;i<s.length();i++) {
			helper(s, i, i);
			helper(s, i, i+1);
		}
		return res;
	}
	
	public static void helper(String s, int left,int right) {
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			right--;
			left++;
		}
		String cur = s.substring(left+1, right);
		if(cur.length()>res.length()) {
			res=cur;
		}
	}
}
