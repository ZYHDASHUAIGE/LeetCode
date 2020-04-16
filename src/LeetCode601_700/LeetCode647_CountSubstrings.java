package LeetCode601_700;

public class LeetCode647_CountSubstrings {

	public static void main(String[] args) {
		System.out.println(CountingSubstring("babad"));

	}
	
	public static int CountingSubstring(String s){
		if(s==null||s.length()==0) {
			return 0;
		}
		boolean[][] dp = new boolean[s.length()][s.length()];
		int result = 0;
		for(int j = 0;j<s.length();j++) {
			for(int i=0;i<=j;i++) {
				dp[i][j] = s.charAt(i)==s.charAt(j)&&((j-i)<=2||dp[i+1][j-1]);
				if(dp[i][j]) {
					result++;
				}
			}
		}
		return result;
	}

}
