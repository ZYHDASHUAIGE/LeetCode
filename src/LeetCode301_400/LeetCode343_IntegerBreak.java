package LeetCode301_400;

public class LeetCode343_IntegerBreak {

	public static void main(String[] args) {
		LeetCode343_IntegerBreak iB = new LeetCode343_IntegerBreak();
		System.out.println(iB.integerBreak(10));
	}

	//把每一个数的最大分割数保存起来
	public int integerBreak(int n) {
		if (n <= 3)
			return n - 1;
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i <= n; i++) {
			for (int j = 1; j <= i / 2; j++)
				dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
		}
		return dp[n];
	}
}
