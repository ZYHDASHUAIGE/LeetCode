package LeetCode101_200;

import java.util.List;

public class LeetCode120_Triangle {

	int row;
	int[] memo;

	public static void main(String[] args) {

	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int[] res = new int[triangle.size()];
		for (int i = 0; i < triangle.size(); i++) {
			res[i] = triangle.get(triangle.size() - 1).get(i);
		}
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				res[j] = triangle.get(i).get(j) + (res[j] < res[j + 1] ? res[j] : res[j + 1]);
			}
		}
		return res[0];
	}

}
