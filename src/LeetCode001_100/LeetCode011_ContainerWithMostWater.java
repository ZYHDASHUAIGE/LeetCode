package LeetCode001_100;

/**
 * 
 * @author Administrator
 *
 * ��Ҳ��˫ָ������
 */
public class LeetCode011_ContainerWithMostWater {

	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7};
		LeetCode011_ContainerWithMostWater l = new LeetCode011_ContainerWithMostWater();
		int result = l.maxArea(height);
		System.out.println(result);

	}
	
	public int maxArea(int[] height) {
		int result = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else
				right--;
		}
		return result;
	}
}
