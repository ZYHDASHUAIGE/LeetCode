package LeetCode01_100;


/**
 * 动态规划
 * f[i][j] = min{f[i-1][j],f[i][j-1]}+grid[i][j]
 * @author Administrator
 *
 */
public class LeetCode064_MinPathSum {

	public static void main(String[] args) {
		int[][] grid = {
				{1,3,1},
				{1,5,1},
				{4,2,1}};
		System.out.println(minPathSum(grid));

	}
	
	public static int minPathSum(int[][] grid) {
		if(grid==null) return 0;
		int res = 0;
		int[][] dp = new int[grid.length][grid[0].length];
		dp[0][0] = grid[0][0];
		for(int i =1;i<grid.length;i++) {
			dp[i][0] = dp[i-1][0]+grid[i][0];
		}
		for(int j = 1;j<grid[0].length;j++) {
			dp[0][j] = dp[0][j-1]+grid[0][j];
		}
		for(int i=1;i<grid.length;i++) {
			for(int j = 1;j<grid[0].length;j++) {
				dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
			}
		}
		res = dp[dp.length-1][dp[0].length-1];
		return res;
		
	}

}
