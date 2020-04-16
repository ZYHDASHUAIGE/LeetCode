package LeetCode001_100;

//旋转的操作用翻转代替，翻转后再加入
public class LeetCode048_RotatePicture {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}

	}

	public static void rotate(int[][] matrix) {
		int len = matrix.length;
		for (int i = 0; i < len / 2; i++) {
			int start = i;
			int end = len - i - 1;
			for (int j = 0; j < end - start; j++) {
				int temp = matrix[start][start + j];
				matrix[start][start + j] = matrix[end - j][start];
				matrix[end - j][start] = matrix[end][end - j];
				matrix[end][end - j] = matrix[start + j][end];
				matrix[start + j][end] = temp;
			}
		}
	}
}