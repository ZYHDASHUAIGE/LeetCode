package LeetCode001_100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode054_SpiralOrderMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
			return res;
		}
		int rowBegin = 0; // 行的起点
		int rowEnd = matrix.length - 1; // 行的终点
		int columnBegin = 0; // 列的起点
		int columnEnd = matrix[0].length - 1; // 列的终点

		while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

			for (int i = columnBegin; i <= columnEnd; i++) {
				res.add(matrix[rowBegin][i]);
			}
			rowBegin++;

			for (int i = rowBegin; i <= rowEnd; i++) {
				res.add(matrix[i][columnEnd]);
			}
			columnEnd--;

			if (rowBegin <= rowEnd) {
				for (int i = columnEnd; i >= columnBegin; i--) {
					res.add(matrix[rowEnd][i]);
				}
			}
			rowEnd--;

			if(columnBegin<=columnEnd) {
				for(int i=rowEnd;i>=rowBegin;i--) {
					res.add(matrix[i][columnBegin]);
				}
			}
			columnBegin++;
		}
		return res;
	}
}
