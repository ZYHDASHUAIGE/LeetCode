package LeetCode101_200;

import java.util.ArrayList;
import java.util.List;

public class LeetCode120_Triangle {

    int row;
    int[] memo;

    public static void main(String[] args) {
        LeetCode120_Triangle l = new LeetCode120_Triangle();
        List<List<Integer>> list = new ArrayList();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        System.out.println(l.minimumTotal(list));
    }

//	public int minimumTotal(List<List<Integer>> triangle) {
//		int[] res = new int[triangle.size()];
//		for (int i = 0; i < triangle.size(); i++) {
//			res[i] = triangle.get(triangle.size() - 1).get(i);
//		}
//		for (int i = triangle.size() - 2; i >= 0; i--) {
//			for (int j = 0; j <= i; j++) {
//				res[j] = triangle.get(i).get(j) + (res[j] < res[j + 1] ? res[j] : res[j + 1]);
//			}
//		}
//		return res[0];
//	}

    public int minimumTotal(List<List<Integer>> triangle) {

        int dp[][] = new int[triangle.size() + 1][triangle.size() + 1];

        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> rows = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + rows.get(i);
            }
        }
        return dp[0][0];
    }
}
