package LeetCode001_100;

public class LeetCode029_TwoNumbersDivided {

	public static void main(String[] args) {
		int result = divide(-7, -2);
		System.out.println(result);

	}
	
	public static int divide(int dividend, int divisor) {
		int sign = 1;
		if(dividend>0&&divisor<0||dividend<0&&divisor>0) {
			sign=-1;
		}
		long long_dividend = Math.abs((long)dividend);
		long long_divisor = Math.abs((long)divisor);
		if(long_dividend<long_divisor||long_dividend==0) return 0;
		long long_result = divide(long_dividend,long_divisor);
        int result = 0;
        if(long_result>Integer.MAX_VALUE) {
        	result = (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }else result = (int)(sign*long_result);
        return result;
	}
	
	public static long divide(long long_dividend,long long_divisor) {
		if(long_dividend<long_divisor) {
			return 0;
		}
		long sum = long_divisor;
		long mulitple = 1;
		while ((sum+sum)<long_dividend) {
			sum+=sum;
			mulitple+=mulitple;
		}
		return mulitple+divide(long_dividend-sum, long_divisor);
	}

}
