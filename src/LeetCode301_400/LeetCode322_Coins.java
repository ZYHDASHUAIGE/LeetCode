package LeetCode301_400;

public class LeetCode322_Coins {

	public int coinChange(int[] coins, int amount) {

		int[] dp = new int[amount+1];
		for(int i = 0;i<=amount;i++) dp[i]=i;
		for(int i=1;i<coins.length;i++) {
			for(int j = 0;j<=amount;j++) {
				if(i>=coins[j]&&dp[i-coins[j]]<dp[i]) {
					dp[i]=dp[i-coins[j]];
				}
			}
		}
		return dp[dp.length-1];
	}
	
	
}
