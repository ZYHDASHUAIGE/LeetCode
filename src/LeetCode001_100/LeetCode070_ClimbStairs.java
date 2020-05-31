package LeetCode001_100;

/**
 * f(n)=f(n-1)+f(n-2)
 *
 * @author Administrator
 */
public class LeetCode070_ClimbStairs {

    public static void main(String[] args) {
        //System.out.println(climbStairs(5));
        LeetCode070_ClimbStairs l = new LeetCode070_ClimbStairs();
        int result = l.climbStairs(5);
        System.out.println(result);
    }

    private int[] init(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = -1;
        }
        return dp;
    }

//	public static int climbStairs(int n) {
//		int result = 0;
//		if(n==1) {
//			return 1;
//		}else if(n==2) {
//			return 2;
//		}else {
//			int[] ways = new int[n];
//			ways[1]=2;
//			ways[0]=1;
//			for(int i=2;i<ways.length;i++) {
//				ways[i]=ways[i-1]+ways[i-2];
//			}
//			result = ways[ways.length-1];
//		}
//
//		return result;
//	}

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        } else {
            int dp[] = init(n);
            return climbs(n, dp);
        }

    }


    public int climbs(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        if (dp[n] == -1)
            dp[n] = climbs(n - 1, dp) + climbs(n - 2, dp);

        return dp[n];

    }

}
