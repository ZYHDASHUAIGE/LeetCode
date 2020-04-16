package LeetCode001_100;

public class LeetCode079_WordSearch {

	public static void main(String[] args) {

	}

	int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	int rows, cols;

	public boolean exist(char[][] board, String word) {
		// 首先对输入条件进行判断，如果输入条件有问题，直接返回false.
		if (word == null || word.length() == 0) {
			return false;
		}
		if (board == null || board.length == 0 || board[0].length == 0) {
			return false;
		}
		rows = board.length;
		cols = board[0].length;
		boolean[][] marked = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// 双层for循环保证可以从矩阵中的每个字符开始进行寻找.
				if (searchWord(board, marked, i, j, 0, word)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean searchWord(char[][] board, boolean[][] marked, int row, int col, int curLen, String word) {
		// 如果curLen的长度和word相同，则返回true，说明此时已经匹配结束！
		if (word.length() == curLen) {
			return true;
		}
		// 对于row和col的数个判断条件,若满足,则直接返回false,说明没有匹配成功.
		if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != word.charAt(curLen)
				|| marked[row][col]) {
			return false;
		}
		// 置marked数组row行col列的字符为true,表示已经被访问过,不可在一次DFS过程中再次访问.
		marked[row][col] = true;
		for (int[] dir : directions) {
			// 注意这里使用if判断，使得我们可以循环遍历directions数组表示的几个方向，这一点值得学习.
			if (searchWord(board, marked, row + dir[0], col + dir[1], curLen + 1, word)) {
				return true;
			}
		}
		// 还原marked数组中row行col列的字符为未访问.
		marked[row][col] = false;
		return false;
	}

}
