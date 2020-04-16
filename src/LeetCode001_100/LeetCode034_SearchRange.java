package LeetCode001_100;

public class LeetCode034_SearchRange {
	
	public static void main(String[] args) {
		int[] nums= {5,7,7,8,8,10};
		int[] res = searchRange(nums, 8);
		for(int s:res) {
			System.out.print(s+" ");
		}
	}
	
	public static int[] searchRange(int[] nums, int target) {
		if(nums==null||nums.length==0) return new int[] {-1,-1};
		int start = findFirst(nums, target);
		if(start==-1) return new int[] {-1,-1};
		int end = findLast(nums, target);
		return new int[] {start,end};

	}
	
	public static int findFirst(int[] nums,int target) {
		int start =0;
		int end = nums.length-1;
		while(start+1<end) {
			int mid= (end-start)/2+start;
			if(nums[mid]<target) {
				start=mid;
			}else {
				end=mid;
			}
		}
		if(nums[start]==target) return start;
		if(nums[end]==target) return end;
		return -1;
	}
	
	public static int findLast(int[] nums,int target) {
		int start =0;
		int end = nums.length-1;
		while(start+1<end) {
			int mid= (end-start)/2+start;
			if(nums[mid]>target) {
				end=mid;
			}else {
				start=mid;
			}
		}
		if(nums[end]==target) return end;
		if(nums[start]==target) return start;		
		return -1;
	}

}
