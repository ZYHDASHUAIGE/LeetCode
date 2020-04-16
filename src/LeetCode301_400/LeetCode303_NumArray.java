package LeetCode301_400;

public class LeetCode303_NumArray {
	
	private int[] sums;

	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		LeetCode303_NumArray assay = new LeetCode303_NumArray(nums);
		int r = assay.sumRange(2, 5);
		System.out.println(r);
	}

    public LeetCode303_NumArray(int[] nums) {
    	sums = new int[nums.length];
        if (nums.length == 0) {
            return;
        }
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] += sums[i - 1] + nums[i];
        }
    }

	public int sumRange(int i, int j) {

		if (i == 0) {
            return sums[j];
        } else {
            return sums[j] - sums[i - 1];
        }
	}

}
