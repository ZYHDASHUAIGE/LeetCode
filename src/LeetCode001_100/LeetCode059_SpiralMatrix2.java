package LeetCode001_100;

public class LeetCode059_SpiralMatrix2 {

	public static void main(String[] args) {
		int[][] matrix = generateMatrix(4);
		for(int i= 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+"   ");
				if(j==matrix[i].length-1) {
					System.out.println();
				}
			}
		}

	}

	public static int[][] generateMatrix(int n) {

		int[][] matrix = new int[n][n];
		int rowBegin = 0;
		int rowEnd = n-1;
		int columnBegin = 0;
		int columnEnd = n-1;
		int num = 1;

		while(rowBegin<=rowEnd && columnBegin<=columnEnd) {
			for(int i=columnBegin;i<=rowEnd;i++) {
				matrix[rowBegin][i] = num++;

			}
			rowBegin++;  //行下移

			for(int i = rowBegin;i<=rowEnd;i++) {
				matrix[i][columnEnd] = num++;

			}
			columnEnd--; //列左移

			for(int i =columnEnd;i>=columnBegin;i--) {
				matrix[rowEnd][i] = num++;
			}
			rowEnd--;

			for(int i = rowEnd;i>=rowBegin;i--) {
				matrix[i][columnBegin] = num++;
			}
			columnBegin++;


		}
		return matrix;
	}
}
