package LeetCode001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * ��̬�滮
 * ����ʽ��f(n)=max[f(n-1)+A(n),A(n)]
 * @author Administrator
 *
 */
public class LeetCode015_TribleSum {

	public static void main(String[] args) {
		int[] a = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(a));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // ȥ���ظ���listԪ��
			int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
			while (low < high) {
				if (nums[low] + nums[high] == sum) {
					res.add(Arrays.asList(nums[i], nums[low], nums[high]));
					while (low < high && nums[low] == nums[low + 1])
						low++;
					while (low < high && nums[high] == nums[high - 1])
						high--;
					low++;
					high--;
				} else if (nums[low] + nums[high] < sum) {
					low++;
				} else
					high--;
			}
		}
		return res;
	}

	// ȥ�������е��ظ�Ԫ��
	public static int[] dropRepetitiveNum(int[] a) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			}
		}

		int[] b = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			b[i] = list.get(i);
		}
		return b;
	}
}
