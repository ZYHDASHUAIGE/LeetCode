package LeetCode001_100;



/**
 *
 * f(n)=f(n-1)+f(n-2)
 * @author Administrator
 *
 */
public class LeetCode070_ClimbStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(5));

	}
	
	public static int climbStairs(int n) {
		int result = 0;
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else {
			int[] ways = new int[n];
			ways[1]=2;
			ways[0]=1;
			for(int i=2;i<ways.length;i++) {
				ways[i]=ways[i-1]+ways[i-2];
			}
			result = ways[ways.length-1];
		}
		
		return result;
	}

}
