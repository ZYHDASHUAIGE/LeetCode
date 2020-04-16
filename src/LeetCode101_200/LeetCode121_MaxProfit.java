package LeetCode101_200;

public class LeetCode121_MaxProfit {
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4,5};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int max = 0;
		for(int i=0;i<prices.length-1;i++) {
			for(int j=i+1;j<prices.length;j++) {
				max=Math.max(max, prices[j]-prices[i]);
			}
			
		}
		return max;
		
		
		///Collections.sort
	}
	
	
}
