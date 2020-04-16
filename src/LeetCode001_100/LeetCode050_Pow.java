package LeetCode001_100;

public class LeetCode050_Pow {
	public static void main(String[] args) {
		System.out.println(myPow(5, -2));
              
	}
	
	public static double myPow(double x, int n) {
		if(n>0) {
			return pow(x,n);
		}else {
			return 1.0/pow(x, n);
		}
	}
	
	public static double pow(double x,int n) {
		if(n==0) return 1;
		double y = pow(x, n/2);
		if(n%2==0) {
			return y*y;
		}else {
			return y*y*x;
		}
		
	}
}
