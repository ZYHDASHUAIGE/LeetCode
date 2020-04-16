package LeetCode001_100;

import java.util.Arrays;

public class LeetCode075_SortColors {

	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		sortColors(nums);
		for(int a: nums) {
			System.out.println(a);
		}
	}
	
	public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
